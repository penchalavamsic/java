/*
Create an abstract class Animal with an abstract method void sound().
Then, create three subclasses, Dog, Cat, and Cow, each implementing 
the sound method with their respective sounds. 
Write a main method to create instances of Dog, Cat, and Cow, 
and invoke the sound method on each instance.
*/

// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();
}

// Dog subclass
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

// Cat subclass
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

// Cow subclass
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos: Moo Moo");
    }
}

// Main class
public class MainAnimal {
    public static void main(String[] args) {
        // Create objects of subclasses
        Animal d = new Dog();
        Animal c = new Cat();
        Animal cw = new Cow();

        // Call sound() on each
        d.sound();
        c.sound();
        cw.sound();
    }
}
