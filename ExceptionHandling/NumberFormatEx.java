//Number Format exception
import java.util.*;
public class NumberFormatEx{
    public static void main(String[] args) {
        Exception er=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        try{
            int a=Integer.parseInt(sc.nextLine()); //converting from string to int
            System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormat exception");
            er=e; //for stack trace

        }
        finally{
            System.out.println("Program run successfully");
            System.out.print(er);
        }

    }
}