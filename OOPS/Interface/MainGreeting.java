/*
Question:
Anonymous Inner Class Implementing an Interface - 
Create an interface Greeting with a method sayHello(). 
Write a method generateGreeting() in another class that uses 
an anonymous inner class to implement the Greeting interface 
and prints a greeting message.
*/

// Interface
interface Greeting {
    void sayHello();
}

// Class with method using anonymous inner class
class GreetingGenerator {
    public void generateGreeting() {
        // Anonymous inner class implementing Greeting
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello! Welcome to the Anonymous Inner Class Example.");
            }
        };

        // Call method
        g.sayHello();
    }
}

// Main class
public class MainGreeting {
    public static void main(String[] args) {
        GreetingGenerator generator = new GreetingGenerator();
        generator.generateGreeting();
    }
}
