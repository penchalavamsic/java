/*Constructor Overloading: Extend the Person class from the previous problem and add
multiple constructors (default, parameterized, etc.) to initialize the attributes. Also, include a
method to display the details.*/
import java.util.*;

class Person {
    String name;
    String country;
    int age;

    // Default constructor
    Person() {
        name = "Unknown";
        country = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Person(String n, String c, int a) {
        name = n;
        country = c;
        age = a;
    }

    // Another constructor with only name
    Person(String n) {
        name = n;
        country = "Unknown";
        age = 0;
    }

    // Setter method
    public void setDetails(String n, String c, int a) {
        name = n;
        country = c;
        age = a;
    }

    // Display method
    void display() {
        System.out.println(name + " is from " + country + " having age " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        p1.display();

        // Using parameterized constructor
        Person p2 = new Person("Lokesh", "India", 31);
        p2.display();

        // Using single-argument constructor
        Person p3 = new Person("Vamsi");
        p3.display();

        // Using setter method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details (name, country, age):");
        String n = sc.nextLine();
        String c = sc.nextLine();
        int a = sc.nextInt();

        Person p4 = new Person();
        p4.setDetails(n, c, a);
        p4.display();
    }
}
