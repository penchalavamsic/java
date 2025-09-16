/*Static Variable: Create a class BankAccount with accno, accType, Balance and static
variable interestRate. Initialize it using a static block. Implement methods to deposit and
withdraw funds. Create objects and display details.*/
class BankAccount {
    int accno;
    String accType;
    double balance;

    // static variable shared by all objects
    static double interestRate;

    // static block to initialize static variable
    static {
        interestRate = 3.5; // initial interest rate in %
        System.out.println("Static block executed: Interest rate set to " + interestRate + "%");
    }

    // Constructor
    BankAccount(int accno, String accType, double balance) {
        this.accno = accno;
        this.accType = accType;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Display details
    void displayDetails() {
        System.out.println("Account No: " + accno +
                           ", Type: " + accType +
                           ", Balance: " + balance +
                           ", Interest Rate: " + interestRate + "%");
    }
}

public class BankAccount_StaticVar {
    public static void main(String[] args) {
        // Create accounts
        BankAccount acc1 = new BankAccount(101, "Savings", 5000);
        BankAccount acc2 = new BankAccount(102, "Current", 10000);

        // Deposit & Withdraw
        acc1.deposit(2000);
        acc1.withdraw(1000);

        acc2.deposit(5000);
        acc2.withdraw(15000); // should fail

        // Display account details
        acc1.displayDetails();
        acc2.displayDetails();
    }
}
