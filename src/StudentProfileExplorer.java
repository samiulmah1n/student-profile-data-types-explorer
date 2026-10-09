import java.util.Scanner;

// The main class contains the program entry point.
public class StudentProfileExplorer {
    public static void main(String[] args) {
        // Scanner reads user input from the console.
        Scanner input = new Scanner(System.in);

        System.out.println("=== Student Profile & Data Types Explorer ===");

        // Read text, then convert it to the required type.
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("Student ID: ");
        long studentId = Long.parseLong(input.nextLine());

        System.out.print("Height in metres (e.g. 1.78): ");
        double height = Double.parseDouble(input.nextLine());

        System.out.print("Average grade (e.g. 8.5): ");
        float grade = Float.parseFloat(input.nextLine());

        System.out.print("Group letter: ");
        char group = input.nextLine().charAt(0);

        System.out.print("Currently enrolled? (true/false): ");
        boolean enrolled = Boolean.parseBoolean(input.nextLine());

        // Student is a custom reference type (a class).
        Student student = new Student(name, age, studentId, height, grade, group, enrolled);

        // Print the profile.
        System.out.println("\n--- STUDENT PROFILE ---");
        student.display();

        // These are all eight Java primitive data types.
        System.out.println("\n--- 8 PRIMITIVE TYPES ---");
        byte small = 100;                       // Small integer.
        short medium = 20_000;                  // Medium-sized integer.
        int whole = 42;                         // Common integer type.
        long large = 9_000_000_000L;            // L marks a long literal.
        float decimal = 3.14f;                  // f marks a float literal.
        double precise = 19.99;                 // Common decimal type.
        char letter = 'J';                      // Single quotes for char.
        boolean learning = true;                // true or false only.

        System.out.println("byte: " + small);
        System.out.println("short: " + medium);
        System.out.println("int: " + whole);
        System.out.println("long: " + large);
        System.out.println("float: " + decimal);
        System.out.println("double: " + precise);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + learning);

        // String[] is an array reference type.
        String[] skills = {"Java basics", "Variables", "Data types", "Git"};
        System.out.println("\n--- SKILLS ARRAY ---");
        for (int i = 0; i < skills.length; i++) {
            System.out.println((i + 1) + ". " + skills[i]);
        }

        // Arithmetic operators: +, -, *, /, and %.
        System.out.println("\n--- ARITHMETIC OPERATORS ---");
        System.out.println("grade + 0.5 = " + (grade + 0.5));
        System.out.println("grade - 5 = " + (grade - 5));
        System.out.println("grade * 2 = " + (grade * 2));
        System.out.println("grade / 2 = " + (grade / 2));
        System.out.println("10 % 3 = " + (10 % 3));

        // Comparison, logical, and ternary operators.
        boolean passing = grade >= 5.0;
        boolean adult = age >= 18;
        boolean enrolledAdult = enrolled && adult;
        String result = passing ? "Passing grade" : "Needs improvement";

        System.out.println("\n--- COMPARISON / LOGICAL ---");
        System.out.println("grade >= 5: " + passing);
        System.out.println("age >= 18: " + adult);
        System.out.println("enrolled AND adult: " + enrolledAdult);
        System.out.println("Ternary result: " + result);

        // Assignment and increment/decrement operators.
        int points = 10;
        points += 5; // Same as points = points + 5.
        System.out.println("\npoints after += 5: " + points);
        points++;    // Increase by one.
        System.out.println("points after ++: " + points);
        points--;    // Decrease by one.
        System.out.println("points after --: " + points);

        // Casting converts a value from one type to another.
        double exact = 9.75;
        int castValue = (int) exact; // Explicit cast drops the fractional part.
        int original = 25;
        double widened = original;   // int converts automatically to double.
        System.out.println("\n--- TYPE CONVERSION ---");
        System.out.println("(int) 9.75 = " + castValue);
        System.out.println("int 25 to double = " + widened);

        // String methods and content comparison.
        System.out.println("\n--- STRING OPERATIONS ---");
        System.out.println("Uppercase name: " + name.toUpperCase());
        System.out.println("Name length: " + name.length());
        System.out.println("Name equals Java Student: " + name.equals("Java Student"));

        input.close(); // Release the input resource.
        System.out.println("\nFinished exploring Java data types!");
    }
}

// A class is a reference type; its objects hold related data.
class Student {
    // Fields are variables belonging to each Student object.
    private String name;
    private int age;
    private long studentId;
    private double height;
    private float grade;
    private char group;
    private boolean enrolled;

    // Constructor initializes a Student object.
    public Student(String name, int age, long studentId, double height,
                   float grade, char group, boolean enrolled) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.height = height;
        this.grade = grade;
        this.group = group;
        this.enrolled = enrolled;
    }

    // Display the object's stored values.
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Height: " + height + " m");
        System.out.println("Average grade: " + grade);
        System.out.println("Group: " + group);
        System.out.println("Currently enrolled: " + enrolled);
    }
}
