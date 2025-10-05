//Power of a number
import java.util.*;
class PowerOfNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value");
		int base=sc.nextInt();
		System.out.println("Enter power value");
		int power=sc.nextInt();
		int result=1;
		for(int i=1;i<=power;i++){
			result=result*base;
		}
		System.out.println(result);
	}
}