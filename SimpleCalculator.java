//Simple calculator using Arthimetic operations
import java.util.*;
class SimpleCalculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter another value");
		int b=sc.nextInt();
		System.out.println("Choose an operation from below");
		System.out.println("1.Addition\n2.Subraction\n3.Division\n4.Multiplication");
		int n=sc.nextInt();
		switch(n){
		case 1:System.out.println("Addition value is "+(a+b));
				break;
		case 2:System.out.println("Subraction value is "+(a-b));
				break;
		case 3:System.out.println("Division value is "+(a/b));
				break;
		case 4:System.out.println("Multiplication value is "+(a*b));
				break;
		default:System.out.println("Invalid Choice");
	}

	}
}