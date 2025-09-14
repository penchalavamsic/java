//Palindrome
import java.util.*;
class Palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n>0){
			int a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		System.out.println("Reversed number is "+rev);
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome");
		}
		else{
			System.out.println(temp+" is not a palindrome");
		}
	}
}