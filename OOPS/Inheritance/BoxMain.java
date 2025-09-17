/*Create class Box and Box3d. Box3d is extended class of Box. The above two classes going
to fulfill the following requirement. Include constructor, set value of length, breadth, height. Find
out area and volume.*/
// Base class
class Box {
    protected double length;
    protected double breadth;
    protected double height;

    // Constructor
    public Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Setter method
    public void setDimensions(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    // Method to calculate surface area of box
    public double area() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
}

// Derived class
class Box3d extends Box {

    // Constructor calls parent constructor
    public Box3d(double l, double b, double h) {
        super(l, b, h);
    }

    // Method to calculate volume
    public double volume() {
        return length * breadth * height;
    }
}

// Main class
public class BoxMain {
    public static void main(String[] args) {
        Box3d b1 = new Box3d(10, 5, 3);

        System.out.println("Surface Area: " + b1.area());
        System.out.println("Volume: " + b1.volume());
    }
}
