//Factorial of a number
//Recursion
import java.util.*;
class Factorial{
	public static int Fact(int n){
		if(n==0||n==1)
			return 1;
		return n*Fact(n-1);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Factorial is"+Fact(a));

	}
}