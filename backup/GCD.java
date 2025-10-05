//Euclid method
//GCD of two numbers
import java.util.*;
class GCD{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Emter another number");
		int b=sc.nextInt();
		int temp;
		while(b!=0){
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(a);
	}
}