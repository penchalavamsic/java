/*
Question:
Create an abstract class Appliance with fields for brand and power
consumption, and an abstract method void turnOn(). 
Create three subclasses, WashingMachine, Refrigerator, and Microwave, 
each providing their own implementation of the turnOn method. 
Write a main method to create instances of WashingMachine, Refrigerator, 
and Microwave, and invoke the turnOn method on each instance to display 
brand and power consumed.
*/

// Abstract class
abstract class Appliance {
    String brand;
    int powerConsumption; // in Watts

    Appliance(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    // Abstract method
    abstract void turnOn();
}

// WashingMachine subclass
class WashingMachine extends Appliance {
    WashingMachine(String brand, int powerConsumption) {
        super(brand, powerConsumption);
    }

    void turnOn() {
        System.out.println("Washing Machine (" + brand + 
                           ") is now ON. Power: " + powerConsumption + "W");
    }
}

// Refrigerator subclass
class Refrigerator extends Appliance {
    Refrigerator(String brand, int powerConsumption) {
        super(brand, powerConsumption);
    }

    void turnOn() {
        System.out.println("Refrigerator (" + brand + 
                           ") is now ON. Power: " + powerConsumption + "W");
    }
}

// Microwave subclass
class Microwave extends Appliance {
    Microwave(String brand, int powerConsumption) {
        super(brand, powerConsumption);
    }

    void turnOn() {
        System.out.println("Microwave (" + brand + 
                           ") is now ON. Power: " + powerConsumption + "W");
    }
}

// Main class
public class MainAppliance {
    public static void main(String[] args) {
        // Create objects
        Appliance wm = new WashingMachine("LG", 1500);
        Appliance rf = new Refrigerator("Samsung", 200);
        Appliance mw = new Microwave("Panasonic", 1200);

        // Call turnOn method
        wm.turnOn();
        rf.turnOn();
        mw.turnOn();
    }
}
