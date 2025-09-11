//Grading System
import java.util.*;
class GradingSystem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the percentage");
		float a=sc.nextFloat();
		int b=(int)a;
		char ch=' ';
		if(b<0||b>100){
			System.out.println("Invalid input");
		}
		else{
			int c=(b/10);
			switch(c){
		case 10:
		case 9:
			ch='A';
			break;
		case 8:
			ch='B';
			break;
		case 7:
			ch='C';
			break;
		case 6:
			ch='D';
			break;
		default:
			System.out.println("Fail");

			}
		System.out.println("Grade is "+ch);	
		}
	}
}