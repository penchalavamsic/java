import java.util.*;

public class ArrayListExample {
  public static void main(String[] args) {
    // Create a new ArrayList
    ArrayList<String> myList = new ArrayList<>();

    // Add some strings to the list
    myList.add("apple");
    myList.add("banana");
    myList.add("cherry");

    // Access the elements of the list
    System.out.println(myList.get(0)); // Output: "apple"
    System.out.println(myList.get(1)); // Output: "banana"
    System.out.println(myList.get(2)); // Output: "cherry"

    // Remove an element from the list
    myList.remove("apple");

    // Check if the list is empty
    if (myList.isEmpty()) {
      System.out.println("The list is empty.");
    } else {
      System.out.println("The list is not empty.");
    }

    // Size of the list
    System.out.println(myList.size()); // Output: 2

    // Is the list contains all the elements?
    if (myList.contains("banana")) {
      System.out.println("Yes, the list contains 'banana'.");
    } else {
      System.out.println("No, the list does not contain 'banana'.");
    }

    // Add some more elements to the list
    myList.add("orange");
    myList.add("grape");

    // Access the elements of the list again
    System.out.println(myList.get(0)); // Output: "apple"
    System.out.println(myList.get(1)); // Output: "banana"
    System.out.println(myList.get(2)); // Output: "cherry"
    System.out.println(myList.get(3)); // Output: "orange"
    System.out.println(myList.get(4)); // Output: "grape"
  }
}