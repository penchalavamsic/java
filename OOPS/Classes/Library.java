/*Implement a Java program that models a Library. Create classes for Library, Book, and
Author. Ensure that the Library class aggregates a collection of Book objects, and each Book
object has an aggregation relationship with an Author object.*/
import java.util.*;

// Author class
class Author {
    private String name;
    private String email;

    // Constructor
    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Method to display Author details
    public void displayAuthor() {
        System.out.println("Author: " + name + " | Email: " + email);
    }
}

// Book class (Aggregation with Author)
class Book {
    private String title;
    private double price;
    private Author author;  // Book has-an Author

    // Constructor
    Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    // Method to display Book details
    public void displayBook() {
        System.out.println("Book: " + title + " | Price: " + price);
        author.displayAuthor(); // Aggregation: Book uses Author
    }
}

// Library class (Aggregation with Books)
class Library {
    private String name;
    private List<Book> books;  // Library has-many Books

    // Constructor
    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // Add book to Library
    public void addBook(Book b) {
        books.add(b);
    }

    // Display Library details
    public void displayLibrary() {
        System.out.println("\nLibrary: " + name);
        System.out.println("Books in Library:");
        for (Book b : books) {
            b.displayBook();
            System.out.println("------------------");
        }
    }
}

// Main Class
public class LibraryApp{
    public static void main(String[] args) {
        // Create Authors
        Author a1 = new Author("Chetan Bhagat", "chetan@example.com");
        Author a2 = new Author("J.K. Rowling", "jkrowling@example.com");

        // Create Books with Authors
        Book b1 = new Book("Five Point Someone", 250.0, a1);
        Book b2 = new Book("Half Girlfriend", 300.0, a1);
        Book b3 = new Book("Harry Potter", 500.0, a2);

        // Create Library
        Library lib = new Library("City Central Library");

        // Add Books to Library
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        // Display Library
        lib.displayLibrary();
    }
}
