/*

Create an interface Animal with methods makeSound() and eat().
Implement this interface in two classes Dog and Cat.
*/

// Interface
interface Animal {
    void makeSound();
    void eat();
}

// Dog class implementing Animal
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof");
    }

    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Cat class implementing Animal
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow");
    }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

// Main class
public class MainInterface {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        d.eat();

        c.makeSound();
        c.eat();
    }
}
