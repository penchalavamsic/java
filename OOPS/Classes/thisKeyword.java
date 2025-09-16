/*Using this: Modify the Person class to include a method that displays the name and age
of the object. Use this keyword to differentiate between class variables and method parameters.
Implement a method to compare two Person objects based on their age.*/
import java.util.*;

class Person {
    String name;
    String country;
    int age;

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.country = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    Person(String name, String country, int age) {
        this.name = name;       // "this" differentiates instance variable from parameter
        this.country = country;
        this.age = age;
    }

    // Setter method
    public void setDetails(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    // Display all details
    void display() {
        System.out.println(this.name + " is from " + this.country + " having age " + this.age);
    }

    // Display only name and age
    void displayNameAge() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    // Compare ages of two persons
    void compareAge(Person other) {
        if (this.age > other.age) {
            System.out.println(this.name + " is older than " + other.name);
        } else if (this.age < other.age) {
            System.out.println(other.name + " is older than " + this.name);
        } else {
            System.out.println(this.name + " and " + other.name + " are of the same age");
        }
    }
}

public class thisKeyword{
    public static void main(String[] args) {
        Person p1 = new Person("Lokesh", "India", 31);
        Person p2 = new Person("Vamsi", "India", 25);

        // Displaying name & age
        p1.displayNameAge();
        p2.displayNameAge();

        // Compare ages
        p1.compareAge(p2);
    }
}
