/*Create a class named 'Member' having the following members:
Data members: 1 – Name, 2 – Age, 3 - Phone number, 4 – Address, 5 - Salary
It also has a method named 'printSalary' which prints the salary of the members. Two classes
'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
have data members'specialization' and 'department' respectively. Now, assign name, age,
phone number, address and salary to an employee and a manager by making an object of both
of these classes and print the same.*/
// Base class
class Member {
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    // Method to set data
    public void setData(String n, int a, String ph, String addr, double s) {
        name = n;
        age = a;
        phoneNumber = ph;
        address = addr;
        salary = s;
    }

    // Method to display data
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

// Derived class Employee
class Employee extends Member {
    private String specialization;

    public void setSpecialization(String spec) {
        specialization = spec;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

// Derived class Manager
class Manager extends Member {
    private String department;

    public void setDepartment(String dept) {
        department = dept;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

// Main class
public class DataMembers {
    public static void main(String[] args) {
        // Employee object
        Employee e = new Employee();
        e.setData("Rahul", 25, "9876543210", "Hyderabad", 35000.50);
        e.setSpecialization("Software Development");

        // Manager object
        Manager m = new Manager();
        m.setData("Vamsi", 30, "9876501234", "Bangalore", 75000.75);
        m.setDepartment("IT");

        // Display details
        System.out.println("---- Employee Details ----");
        e.display();

        System.out.println("\n---- Manager Details ----");
        m.display();
    }
}
