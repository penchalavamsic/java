/*
Interface with Multiple Implementations - Create an interface Payment with a
method pay(). Implement this interface in two classes CreditCardPayment and
PaypalPayment. Write a PaymentProcessor class that uses the Payment interface to
process payments.
*/

// Payment interface
interface Payment {
    void pay(double amount);
}

// CreditCardPayment implementing Payment
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// PaypalPayment implementing Payment
class PaypalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// PaymentProcessor class using Payment interface
class PaymentProcessor {
    private Payment payment;

    // Constructor to inject payment method
    PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void processPayment(double amount) {
        payment.pay(amount);
    }
}

// Main class
public class MainPayment {
    public static void main(String[] args) {
        // Using CreditCardPayment
        PaymentProcessor ccProcessor = new PaymentProcessor(new CreditCardPayment());
        ccProcessor.processPayment(500.0);

        // Using PaypalPayment
        PaymentProcessor ppProcessor = new PaymentProcessor(new PaypalPayment());
        ppProcessor.processPayment(1200.5);
    }
}
