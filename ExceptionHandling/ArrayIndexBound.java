
//ArrayIndex Bound Out exception
import java.util.Scanner;
class ArrayIndexBound{
    public static void main(String[] args) {
        int arr[] = new int[5];
        Exception ex=null;  //for stack trace
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values into array");
        try{
        for(int i=0;i<=5;i++){
            arr[i] = sc.nextInt();
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Array index out of bound");
            ex=e; //stroing in ex 
        }
        finally{
            System.out.println("Progarm runs successfully");
        }
        ex.printStackTrace();
        
    }
}
