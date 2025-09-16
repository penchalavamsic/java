/*Composition and Aggregation: Create a class Address with attributes street, city, and
state. Then create a class Person with attributes name and an Address object. Demonstrate
how to use com Write a Java class representing a Student. Encapsulate the student's name,
age, and grade point average (GPA) with private access modifiers. Provide getter and setter
methods to access and modify these attributes position to model the relationship between a
person and their address*/
class Address {
    String street;
    String city;
    String state;

    Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    void displayAddress() {
        System.out.println(street + ", " + city + ", " + state);
    }
}

// Person uses composition (has-an Address)
class Person {
    String name;
    Address address; // Composition relationship

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.print("Address: ");
        address.displayAddress();
    }
}

// Student class demonstrating Encapsulation
class Student {
    private String name;
    private int age;
    private double gpa;

    // Constructor
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter and Setter for GPA
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
        }
    }

    // Method to display details
    public void displayStudent() {
        System.out.println("Student Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
}

public class CompAggr{
    public static void main(String[] args) {
        // Composition Example
        Address addr = new Address("123 Main St", "Chennai", "Tamil Nadu");
        Person p1 = new Person("Vamsi", addr);
        System.out.println("=== Person Details (Composition Example) ===");
        p1.displayPerson();

        // Encapsulation Example
        Student s1 = new Student("Lokesh", 21, 8.5);
        System.out.println("\n=== Student Details (Encapsulation Example) ===");
        s1.displayStudent();

        // Update using setters
        s1.setAge(22);
        s1.setGpa(9.0);

        System.out.println("After Updates:");
        s1.displayStudent();
    }
}
