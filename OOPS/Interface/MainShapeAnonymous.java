/*
Question:
Anonymous Inner Class Extending an Abstract Class -
Create an abstract class Shape with an abstract method draw(). 
Write a method createShape() in another class that uses an anonymous inner class 
to extend Shape and provides an implementation for the draw() method.
*/

// Abstract class
abstract class Shape {
    abstract void draw();
}

// Class with method using anonymous inner class
class ShapeFactory {
    public void createShape() {
        // Anonymous inner class extending Shape
        Shape shape = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a Circle using an anonymous inner class.");
            }
        };

        // Call method
        shape.draw();
    }
}

// Main class
public class MainShapeAnonymous {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.createShape();
    }
}
