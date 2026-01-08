
// Constructor in Java
// A constructor in Java is a special method that is automatically called
// when an object is created. It is used to initialize the object's data members.

// Properties of constructor:
// 1. Constructor name must be same as class name.
// 2. Constructor has no return type (not even void).
// 3. It is automatically invoked when an object is created.
// 4. It can take parameters.
// 5. If no constructor is defined, Java provides a default constructor.

// Types of constructor:
// 1. Default (Non-Parameterized) Constructor
// "A constructor that does not take any parameters."
// 2. Parameterized Constructor
// "A constructor that takes parameters to initialize object values."
// 3. Copy Constructor
// "A constructor that creates a new object by copying another object."
// 4. Static Constructor
// Java does NOT support static constructors directly,
// but static blocks are used for static initialization.

public class constructor {

    // Student details
    String name;
    int age;

    // Static block (acts like static constructor)
    static {
        System.out.println("Static block executed");
    }

    // Default (Non-Parameterized) Constructor
    constructor() {
        System.out.println("Default constructor called");
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor (user-defined)
    constructor(constructor s) {
        this.name = s.name;
        this.age = s.age;
    }

    // Method to display student details
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method (program execution starts here)
    public static void main(String[] args) {

        // Default constructor example
        constructor s1 = new constructor();
        s1.printInfo();

        // Parameterized constructor example
        constructor s2 = new constructor("Priya", 20);
        s2.printInfo();

        // Copy constructor example
        constructor s3 = new constructor(s2);
        s3.printInfo();
    }
}
