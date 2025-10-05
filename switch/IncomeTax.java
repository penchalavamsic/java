//Income Tax generation
import java.util.*;
class IncomeTax{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount");
	int amount =sc.nextInt();
	double tax=0.0;
	if(amount<0){
		System.out.println("Invalid amount");
	}
	else{
		switch(amount/100000){
		case 0:	//99.9K
		case 1:	//1L-1.9L
		case 2:	//2L-2.9L
			tax=0.0;
			break;
		case 3: //3L-3.99L
		case 4: //4L-4.99L
			tax=0.05;
			break;
		case 5: //5L-5.99L
		case 6:
		case 7:
		case 8:
		case 9: //upto 9.99L
			tax=0.10;
			break;
		default: //above 10,00,000
			tax=0.30;
		}
	
	System.out.println("Payable annual salary is "+(amount*(1-tax)));
	}

}

}