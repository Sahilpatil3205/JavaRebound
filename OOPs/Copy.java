

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Parameterized constructor
    Student(Student s2) {
        this.name = s2.name; // Copy s2 info into s1
        this.age = s2.age;
    }

    // Default constructor
    Student() {
        System.out.println("Hi, I am --");
    }
}

public class Copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sahil";
        s1.age = 20;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

