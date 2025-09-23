//Arthimetic exception handling
import java.util.Scanner;
public class ArthimeticException{
    public static void main(String[] args) {
        int a=10;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        try {
            int ans=a/b;
            System.out.println("The answer is "+ans);
        } catch (Exception e) {
            System.err.println("Erro: Divison by zero is not possible");
            e.printStackTrace(); //to print the reason and error happend line
        }
        finally{
            System.err.println("Program runs");
        }
        

    }
}