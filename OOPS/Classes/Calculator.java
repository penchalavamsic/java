/*Class and methods: Create a class Calculator with relevant data members and a
constructor. Implement methods for basic arithmetic operations (addition, subtraction,
multiplication, division, modulus) and demonstrate their usage.*/
class Calculator {
    int num1;
    int num2;

    // Constructor
    Calculator(int num1, int num2) {
        this.num1 = num1;   // using "this" to differentiate variables
        this.num2 = num2;
    }

    // Addition
    int add() {
        return num1 + num2;
    }

    // Subtraction
    int subtract() {
        return num1 - num2;
    }

    // Multiplication
    int multiply() {
        return num1 * num2;
    }

    // Division (handling divide by zero)
    double divide() {
        if (num2 != 0)
            return (double) num1 / num2;
        else
            System.out.println("Error: Division by zero!");
        return 0;
    }

    // Modulus (handling divide by zero)
    int modulus() {
        if (num2 != 0)
            return num1 % num2;
        else {
            System.out.println("Error: Modulus by zero!");
            return 0;
        }
    }

    // Display all results
    void displayResults() {
        System.out.println("Numbers: " + num1 + ", " + num2);
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Division: " + divide());
        System.out.println("Modulus: " + modulus());
    }
}

public class Calculator{
    public static void main(String[] args) {
        // Create calculator object
        Calculator calc1 = new Calculator(20, 5);
        calc1.displayResults();

        System.out.println();

        // Another example
        Calculator calc2 = new Calculator(15, 0); // division & modulus will show error
        calc2.displayResults();
    }
}
