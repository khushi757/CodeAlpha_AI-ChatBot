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
        // Java
responses.put("jvm", "JVM stands for Java Virtual Machine.");
responses.put("jre", "JRE stands for Java Runtime Environment.");
responses.put("jdk", "JDK stands for Java Development Kit.");
responses.put("inheritance", "Inheritance allows one class to acquire properties of another class.");
responses.put("polymorphism", "Polymorphism allows one interface to have multiple implementations.");
responses.put("encapsulation", "Encapsulation binds data and methods together.");
responses.put("abstraction", "Abstraction hides implementation details and shows only functionality.");

// DSA
responses.put("binary search", "Binary Search works on sorted arrays and has O(log n) complexity.");
responses.put("sorting", "Sorting arranges data in ascending or descending order.");
responses.put("bubble sort", "Bubble Sort repeatedly swaps adjacent elements.");
responses.put("merge sort", "Merge Sort uses divide and conquer with O(n log n) complexity.");
responses.put("quick sort", "Quick Sort selects a pivot and partitions the array.");
responses.put("tree", "A Tree is a hierarchical data structure.");
responses.put("graph", "A Graph consists of vertices and edges.");

// Database
responses.put("dbms", "DBMS stands for Database Management System.");
responses.put("sql", "SQL is used to manage and query databases.");
responses.put("mysql", "MySQL is a popular relational database management system.");
responses.put("primary key", "A Primary Key uniquely identifies a record in a table.");
responses.put("foreign key", "A Foreign Key links two tables together.");

// Operating System
responses.put("os", "Operating System manages computer hardware and software resources.");
responses.put("linux", "Linux is an open-source operating system.");
responses.put("windows", "Windows is a popular operating system developed by Microsoft.");
responses.put("process", "A Process is a program in execution.");
responses.put("thread", "A Thread is the smallest unit of CPU execution.");

// Computer Networks
responses.put("computer network", "A Computer Network connects multiple devices for communication.");
responses.put("ip address", "An IP Address uniquely identifies a device on a network.");
responses.put("http", "HTTP stands for HyperText Transfer Protocol.");
responses.put("https", "HTTPS is the secure version of HTTP.");
responses.put("tcp", "TCP provides reliable communication between devices.");

// Git & GitHub
responses.put("git", "Git is a distributed version control system.");
responses.put("github", "GitHub is a platform for hosting Git repositories.");
responses.put("commit", "A commit saves changes to a Git repository.");
responses.put("repository", "A repository stores project files and history.");
responses.put("branch", "A branch allows independent development of features.");

// Career
responses.put("software developer", "A software developer designs and builds applications.");
responses.put("full stack developer", "A full stack developer works on both frontend and backend.");
responses.put("frontend", "Frontend development focuses on the user interface.");
responses.put("backend", "Backend development handles server-side logic.");
responses.put("placement", "Placements help students secure jobs after graduation.");

// Motivation
responses.put("study", "Consistency is more important than studying for long hours occasionally.");
responses.put("discipline", "Discipline helps you achieve long-term goals.");
responses.put("focus", "Avoid distractions and work on one task at a time.");
responses.put("goal", "Break large goals into smaller achievable tasks.");
System.out.println("\nKnowledge Base Loaded Successfully!");
System.out.println("Total Topics Available: " + responses.size());

        String userName = "";

System.out.println("========================================");
System.out.println("      AI CHATBOT VERSION 2.0");
System.out.println("========================================");
System.out.println("Type 'help' for available commands.");
System.out.println("Type 'bye' to exit the chatbot.");
System.out.println("========================================");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
               System.out.println("\nBot: Thank you for using AI ChatBot.");
System.out.println("Bot: Keep learning and keep growing!");
System.out.println("Bot: Goodbye! Have a great day.");;
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
System.out.println("\n========== HELP MENU ==========");

System.out.println("\nProgramming");
System.out.println("----------------");
System.out.println("java");
System.out.println("python");
System.out.println("dsa");
System.out.println("oop");
System.out.println("array");
System.out.println("linked list");
System.out.println("stack");
System.out.println("queue");
System.out.println("hashmap");
System.out.println("binary search");
System.out.println("sorting");
System.out.println("tree");
System.out.println("graph");

System.out.println("\nDatabase");
System.out.println("----------------");
System.out.println("dbms");
System.out.println("sql");
System.out.println("mysql");
System.out.println("primary key");
System.out.println("foreign key");

System.out.println("\nOperating System");
System.out.println("----------------");
System.out.println("os");
System.out.println("linux");
System.out.println("windows");
System.out.println("process");
System.out.println("thread");

System.out.println("\nGit & GitHub");
System.out.println("----------------");
System.out.println("git");
System.out.println("github");
System.out.println("commit");
System.out.println("repository");
System.out.println("branch");

System.out.println("\nCareer");
System.out.println("----------------");
System.out.println("internship");
System.out.println("interview");
System.out.println("resume");
System.out.println("placement");
System.out.println("software developer");

System.out.println("\nGeneral");
System.out.println("----------------");
System.out.println("hello");
System.out.println("my name is <your name>");
System.out.println("who am i");
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

                    System.out.println("Bot: Sorry, I don't know the answer yet.");
System.out.println("Bot: Type 'help' to see the available commands.");
                }
            }
        }

        sc.close();
    }
}