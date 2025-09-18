/*
Create an interface Vehicle with a default method startEngine() 
that prints "Engine started". 
Implement this interface in the class Car and override the startEngine() method.
*/

// Interface
interface Vehicle {
    // Default method
    default void startEngine() {
        System.out.println("Engine started");
    }
}

// Car class implementing Vehicle
class Car implements Vehicle {
    // Overriding the default method
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a roar!");
    }
}

// Main class
public class MainVehicle {
    public static void main(String[] args) {
        Vehicle v = new Car();

        // Calls overridden method in Car
        v.startEngine();
    }
}
