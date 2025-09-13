//Leap Year
import java.util.*;
class LeapYear{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int a=sc.nextInt();
		if(a%4==0){
			System.out.println(a+" is a Leap Year");
		}
		else{
			System.out.println(a+" is not a Leap Year");
		}
		
	}
}