package OOPs;

abstract class Shape {
    // Abstract method to enforce area calculation in derived classes
    public abstract void area();
}

class Triangle extends Shape {
    // Overriding the area method

    public void area() {
        System.out.println("Triangle area formula: 0.5 * base * height");
    }

    // Overloaded method to calculate area based on given dimensions
    public void area(int l, int h) {
        System.out.println("Area of Triangle: " + (0.5 * l * h));
    }
}

public class Polymorph2 {
    public static void main(String[] args) {
        // Create an instance of Triangle
        Triangle t = new Triangle();

        // Call the overloaded method to calculate area
        t.area(5, 6);

        // Call the overridden method for information
        t.area();
    }
}
