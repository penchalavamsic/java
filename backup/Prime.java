//Prime number
import java.util.*;
class Prime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int c=0;
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){
			if(a%i==0){
				c++;
			}
		}
		if(c==2){
			System.out.println(a+" is a prime number");
		}
		else{
			System.out.println(a+" is not a prime number");
		}
	}
}