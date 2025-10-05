/*Demonstrate calling the constructor of the base class from the constructor of the derived
class. Create objects of person and employee classes to show the order of invocation of
constructors.*/
// Base class
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String n, int a) {
        name = n;
        age = a;
        System.out.println("Person constructor called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class
class Employee extends Person {
    private int empId;
    private double salary;

    // Constructor of Employee calls constructor of Person using super()
    public Employee(String n, int a, int id, double s) {
        super(n, a); // calling base class constructor
        empId = id;
        salary = s;
        System.out.println("Employee constructor called");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + empId + ", Salary: " + salary);
    }
}

// Main class
public class CallingConstructor{
    public static void main(String[] args) {
        System.out.println("Creating Person object:");
        Person p = new Person("Rahul", 25);

        System.out.println("\nCreating Employee object:");
        Employee e = new Employee("Vamsi", 22, 101, 50000);

        System.out.println("\n--- Display Details ---");
        p.display();
        e.display();
    }
}
