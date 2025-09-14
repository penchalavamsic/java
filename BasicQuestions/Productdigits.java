//Product of digits of a number
import java.util.*;
class Productdigits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int product=1, temp;
		while(n>0){
			temp=n%10;
			product=product*temp;
			n=n/10;
		}
		System.out.println("The product of given number is "+product);
	}
}
