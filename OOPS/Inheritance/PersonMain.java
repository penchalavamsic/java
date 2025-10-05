/*Define a base class Person and a derived class employee with single inheritance. Define
SetData() member functions in each of the class with different signatures to set the data
members and demonstrate overloading of member functions. Define GetData() member
functions in each of the class with same signatures to display data and demonstrate overriding
of member functions.*/
// Base class
class Person {
    protected String name;
    protected int age;

    // Overloaded method in base class
    public void setData(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display data (will be overridden)
    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Employee extends Person {
    private int empId;
    private double salary;

    // Overloaded method in derived class (different signature)
    public void setData(String n, int a, int id, double s) {
        // Call parent setData
        super.setData(n, a);
        empId = id;
        salary = s;
    }

    // Overriding getData()
    @Override
    public void getData() {
        super.getData(); // call parent display also
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.setData("Rahul", 25);
        System.out.println("---- Person Data ----");
        p.getData();

        Employee e = new Employee();
        e.setData("Vamsi", 22, 101, 45000.50);
        System.out.println("\n---- Employee Data ----");
        e.getData();
    }
}
