//Armstrong number
import java.util.*;
class Armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int original=n;
		int convert=String.valueOf(n).length();//Converting int to string for lenght
		int sample=0, arm=0;
		while(n>0){
			sample=n%10;
			arm=arm+(int)Math.pow(sample, convert);//converting pow double to int
			n=n/10;
		}
		System.out.println(arm);
		if(arm==original){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not a armstrong number");
		}

	}
}