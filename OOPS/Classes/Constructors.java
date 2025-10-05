/*Using this in Constructors: Create a class Rectangle with attributes length and width.
Implement a parameterized constructor that initializes these attributes. Use this to differentiate
between class variables and constructor parameters. Include methods to calculate the area and
perimeter.*/
class Rectangle {
    double length;
    double width;

    // Parameterized constructor
    Rectangle(double length, double width) {
        this.length = length;   // "this" refers to the instance variable
        this.width = width;
    }

    // Method to calculate area
    double calculateArea() {
        return this.length * this.width;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    // Method to display rectangle details
    void displayDetails() {
        System.out.println("Length: " + this.length + ", Width: " + this.width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Constructors{
    public static void main(String[] args) {
        // Creating rectangle objects
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7.5, 3.2);

        // Display details
        r1.displayDetails();
        System.out.println();
        r2.displayDetails();
    }
}
