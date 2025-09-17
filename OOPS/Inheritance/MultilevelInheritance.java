/*Write a program to give example for multilevel inheritance in Java.*/
// Base class
class Person {
    protected String name;
    protected int age;

    public void setPerson(String n, int a) {
        name = n;
        age = a;
    }

    public void getPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (level 1)
class Employee extends Person {
    protected int empId;
    protected double salary;

    public void setEmployee(int id, double s) {
        empId = id;
        salary = s;
    }

    public void getEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

// Derived class (level 2)
class Manager extends Employee {
    private String department;

    public void setManager(String dept) {
        department = dept;
    }

    public void getManager() {
        System.out.println("Department: " + department);
    }
}

// Main class
public class MultilevelInheritance{
    public static void main(String[] args) {
        Manager m = new Manager();

        m.setPerson("Vamsi", 22);        // from Person
        m.setEmployee(101, 50000.0);     // from Employee
        m.setManager("IT");              // from Manager

        System.out.println("---- Manager Details ----");
        m.getPerson();    // Person class method
        m.getEmployee();  // Employee class method
        m.getManager();   // Manager class method
    }
}
