//Electricity bill generation based on Units
import java.util.*;
import java.lang.*; //for Math.ceil() method
class ElectricityBill{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no.of units consumed");
			float units=sc.nextFloat();
			int b=(int)Math.ceil(units);
			int costUnit=0;

			if(b<0){
				System.out.println("Invalid input");
			}
			else{
				switch(b/100){
				case 0:
					costUnit=5;//0-99
					break; 
				case 1:
					costUnit=6; //100-199
					break;
				case 2:
					costUnit=7;	//200-299
					break;
				default:
					costUnit=8;	//300 and above
				}
			}
		System.out.println("Total bill is "+(b*costUnit));
	}
}