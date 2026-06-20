import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> responses = new HashMap<>();

        // Programming
        responses.put("java", "Java is an object-oriented programming language.");
        responses.put("python", "Python is a high-level programming language.");
        responses.put("c++", "C++ is a powerful language used in system programming.");
        responses.put("dsa", "DSA stands for Data Structures and Algorithms.");
        responses.put("oop", "OOP means Object-Oriented Programming.");
        responses.put("array", "Array is a collection of elements stored in contiguous memory.");
        responses.put("linked list", "Linked List is a linear data structure consisting of nodes.");
        responses.put("stack", "Stack follows LIFO (Last In First Out).");
        responses.put("queue", "Queue follows FIFO (First In First Out).");
        responses.put("hashmap", "HashMap stores key-value pairs.");

        // Career
        responses.put("internship", "Internships provide practical industry experience.");
        responses.put("interview", "Practice DSA, OOP, DBMS and projects for interviews.");
        responses.put("resume", "Keep your resume concise and project-focused.");
        responses.put("software engineer", "Software engineers design and develop software.");

        // College
        responses.put("cgpa", "CGPA is the cumulative grade point average.");
        responses.put("semester", "A semester is an academic term in college.");
        responses.put("assignment", "Assignments help improve understanding of subjects.");
        responses.put("project", "Projects help apply theoretical knowledge.");

        // General Knowledge
        responses.put("capital of india", "New Delhi is the capital of India.");
        responses.put("capital of usa", "Washington D.C. is the capital of USA.");
        responses.put("prime minister of india", "Please check the latest information online.");
        responses.put("president of india", "Please check the latest information online.");

        // Math
        responses.put("prime number", "A prime number has exactly two factors.");
        responses.put("factorial", "Factorial of n is the product of all positive integers up to n.");
        responses.put("pythagoras theorem", "In a right triangle, a² + b² = c².");

        // Motivation
        responses.put("motivate me", "Keep learning. Small daily improvements lead to big results.");
        responses.put("success", "Success comes from consistency and discipline.");
        responses.put("hard work", "Hard work beats talent when talent doesn't work hard.");

        String userName = "";

        System.out.println("=================================");
        System.out.println("       AI CHATBOT V2");
        System.out.println("Type 'help' for commands");
        System.out.println("Type 'bye' to exit");
        System.out.println("=================================");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            }

            else if (input.startsWith("my name is")) {

                userName = input.substring(11).trim();

                System.out.println("Bot: Nice to meet you " + userName + "!");
            }

            else if (input.equals("who am i")) {

                if (userName.isEmpty()) {
                    System.out.println("Bot: I don't know your name yet.");
                } else {
                    System.out.println("Bot: You are " + userName + ".");
                }
            }

            else if (input.equals("hello") || input.equals("hi")) {

                System.out.println("Bot: Hello! How can I help you?");
            }

            else if (input.contains("time")) {

                System.out.println("Bot: Current Time: " +
                        LocalTime.now().withNano(0));
            }

            else if (input.contains("date")) {

                System.out.println("Bot: Today's Date: " +
                        LocalDate.now());
            }

            else if (input.equals("help")) {

                System.out.println("\n===== COMMANDS =====");

                System.out.println("hello");
                System.out.println("my name is khushi");
                System.out.println("who am i");
                System.out.println("java");
                System.out.println("python");
                System.out.println("dsa");
                System.out.println("oop");
                System.out.println("array");
                System.out.println("linked list");
                System.out.println("stack");
                System.out.println("queue");
                System.out.println("hashmap");
                System.out.println("internship");
                System.out.println("interview");
                System.out.println("resume");
                System.out.println("cgpa");
                System.out.println("project");
                System.out.println("capital of india");
                System.out.println("factorial");
                System.out.println("date");
                System.out.println("time");
                System.out.println("bye");
            }

            else {

                boolean found = false;

                for (String key : responses.keySet()) {

                    if (input.contains(key)) {

                        System.out.println("Bot: " +
                                responses.get(key));

                        found = true;

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Bot: Sorry, I don't understand that.");
                }
            }
        }

        sc.close();
    }
}