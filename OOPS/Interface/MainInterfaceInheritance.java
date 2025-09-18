/*
Question:
Interface Inheritance - Create an interface Shape with methods draw() and calculateArea(). 
Create another interface Colorful that extends Shape and adds a method fillColor(). 
Implement these interfaces in the class Circle.
*/

// Parent interface
interface Shape {
    void draw();
    double calculateArea();
}

// Child interface extending Shape
interface Colorful extends Shape {
    void fillColor(String color);
}

// Circle class implementing Colorful (which includes Shape too)
class Circle implements Colorful {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void fillColor(String color) {
        System.out.println("Filling Circle with color: " + color);
    }
}

// Main class
public class MainInterfaceInheritance {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        c.draw();
        System.out.println("Area of Circle: " + c.calculateArea());
        c.fillColor("Red");
    }
}
