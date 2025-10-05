/*Create a class with a method that prints "This is parent class" and its subclass with another
method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/
// Parent class
class Parent {
    public void parentMethod() {
        System.out.println("This is parent class");
    }
}

// Child class
class Child extends Parent {
    public void childMethod() {
        System.out.println("This is child class");
    }
}

// Main class
public class ParentChild{
    public static void main(String[] args) {
        // 1 - method of parent class by object of parent class
        Parent p = new Parent();
        p.parentMethod();

        // 2 - method of child class by object of child class
        Child c = new Child();
        c.childMethod();

        // 3 - method of parent class by object of child class
        c.parentMethod();
    }
}
