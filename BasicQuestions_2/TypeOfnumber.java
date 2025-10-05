//To check whether a number is +ve, -ve, 0
import java.util.*;
class TypeOfnumber{
	public static void main(String args[]){
		System.out.println("Enter a number");
		Scanner inp=new Scanner(System.in);
		int a=inp.nextInt();
		if(a>0){
			System.out.println("Positive number");
		}
		else if(a<0){
			System.out.println("Negative number");
		}
		else{
			System.out.println("Zero");
		}
	}
}