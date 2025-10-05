/*
Question:
Anonymous Inner Class Extending a Regular Class -
Create a class Printer with a method printMessage(). 
Write a method createPrinter() in another class that uses 
an anonymous inner class to extend Printer and overrides 
the printMessage() method.
*/

// Regular class
class Printer {
    void printMessage() {
        System.out.println("Default Printer Message");
    }
}

// Another class using anonymous inner class
class PrinterFactory {
    public void createPrinter() {
        // Anonymous inner class extending Printer
        Printer printer = new Printer() {
            @Override
            void printMessage() {
                System.out.println("Custom Printer Message from Anonymous Inner Class.");
            }
        };

        // Call method
        printer.printMessage();
    }
}

// Main class
public class MainPrinterAnonymous {
    public static void main(String[] args) {
        PrinterFactory factory = new PrinterFactory();
        factory.createPrinter();
    }
}
