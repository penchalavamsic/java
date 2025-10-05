//Null pointer exception
import java.util.*;
public class NullPointer{
    public static void main(String[] args) {
          String name=null; //intializing with null
          String name2=null;
          Exception ex=null;
    Scanner sc=new Scanner(System.in);
        try {
            System.out.println("enter the name"); //taking input from user
            name=sc.nextLine();
            int length=name.length(); //checking the length of string
            int length2=name2.length();// for seeing the exception
            System.out.println("Lenght of string"+length);

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
            ex=e;
        }
        finally{
            System.out.println("Program runned successfully");
            System.out.println(ex);
        }

    }
}