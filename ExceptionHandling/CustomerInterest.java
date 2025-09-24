/*Create Customer class with the relevant information
like name, address, id, phone no etc. Write a parameterized
constructor and relevant methods (disp(), etc) appropriately.
Create Account class with account type, account number,
minimum balance etc., Write calculateInterest method (use simple
interest – assume time and rate appropriately).
Create a user defined exception class
“NegativeBalanceException” and throw that exception when there
is negative balance while calculating the interest.
Use Account class in Customer class display the details of
customers with account information. (No Inheritance – use
association only)*/
// User defined exception
class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

// Customer class
class Customer {
    String name;
    String address;
    String id;
    int phno;
    Account account; // Association (HAS-A relationship)

    Customer(String name, String address, String id, int phno, Account account) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.phno = phno;
        this.account = account;
    }

    public void disp() {
        System.out.println("----- Customer Details -----");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("ID: " + id);
        System.out.println("Phone No: " + phno);
        account.disp1(); // display account details also
    }
}

// Account class
class Account {
    static String type = "Savings Account";
    int accno;
    double min_bal;

    Account(int accno, double min_bal) {
        this.accno = accno;
        this.min_bal = min_bal;
    }

    // calculate simple interest
    public double calculateInterest(double rate, double time) throws NegativeBalanceException {
        if (min_bal <= 0) {
            throw new NegativeBalanceException("Balance is negative or zero. Cannot calculate interest!");
        }
        return (min_bal * rate * time) / 100; // Simple Interest formula
    }

    void disp1() {
        System.out.println("----- Account Details -----");
        System.out.println("Account Type: " + type);
        System.out.println("Account Number: " + accno);
        System.out.println("Minimum Balance: " + min_bal);
    }
}

// Main class
public class CustomerInterest {
    public static void main(String[] args) {
        // create account
        Account acc1 = new Account(12345, 0000);

        // create customer with account
        Customer cust1 = new Customer("Vamsi", "Tirupati", "C001", 987654321, acc1);

        // display customer + account details
        cust1.disp();

        try {
            double interest = acc1.calculateInterest(5, 2); // rate=5%, time=2 years
            System.out.println("Calculated Interest: " + interest);
        } catch (NegativeBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
