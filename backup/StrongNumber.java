//Strong number is a number where sum of its digits factorial is equal to the number
import java.util.*;
class StrongNumber{
	public static int Fact(int a){
		if(a==1)
			return 1;
		return a*Fact(a-1);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int n1=n;
		int sum=0, temp;
		while(n>0){
			temp=n%10;
			sum=sum+Fact(temp);
			n=n/10;
		}
		if(n1==sum){
			System.out.println(n1+" is a strong number");
		}
		else{
			System.out.println(n1+" is not a strong number");
		}

	}
}