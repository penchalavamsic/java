//Days in a month
import java.util.*;
class MonthDays{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month number between (1-12)");
		int a=sc.nextInt();
		switch(a){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");
		default:
			System.out.println("Invalid Choice");
		}
	}
}