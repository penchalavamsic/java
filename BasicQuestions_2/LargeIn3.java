//Largest number from 3 numbers
import java.util.*;
class LargeIn3{
	public static void main(String args[]){
		System.out.println("Enter three numbers");	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>c)){
			System.out.println(a+" is largest");	
		}
		else if(b>c){
			System.out.println(b+" is largest");	
		}
		else{
			System.out.println(c+" is largest");	
		}
	}
}