package OOPs;

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        System.out.println("Hi, I am the default constructor.");
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print student details
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Student s1 = new Student("Sahil", 19);
        s1.printInfo();

        // Creating an object using the default constructor
        Student s2 = new Student();
        s2.name = "Ankit"; // Assign values manually
        s2.age = 20;
        s2.printInfo();
    }
}
