/*
Create an abstract class Shape with an abstract method double area().
Then, create two subclasses, Circle and Rectangle, that extend Shape 
and provide implementations for the area method. 
Write a main method to create instances of Circle and Rectangle, 
and display their areas.
*/

// Abstract class
abstract class Shape {
    // Abstract method
    abstract double area();
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method
    double area() {
        return length * width;
    }
}

// Main class
public class Shapes {
    public static void main(String[] args) {
        // Create Circle instance
        Shape c = new Circle(5);
        System.out.println("Area of Circle: " + c.area());

        // Create Rectangle instance
        Shape r = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + r.area());
    }
}
