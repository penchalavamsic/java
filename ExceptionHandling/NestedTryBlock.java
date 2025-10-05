//Nested try blocks in exception handling
import java.util.*;

public class NestedTryBlock{
	public static void main(String[] args) {
		int [] arr={1,5,6,8,4};
		int a=10, b, c;
		Exception e1=null, e2=null; //stack trace stroing
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		try{
			c=a/b;
			System.out.println("Division of a and b is "+c);
			try{
				System.out.println("Array value is "+arr[5]);
			}
			catch(ArrayIndexOutOfBoundsException e){
			System.err.println("ArrayIndexOutOfBoundsException "); //for inner try block
			e2=e;

			}
		
			catch(ArithmeticException e){
				System.err.println("ArithmeticException "); //for outer try block
				e1=e;
			}
		
		}
		finally{
			System.out.println("Program completed successfully");
		}
	}
}