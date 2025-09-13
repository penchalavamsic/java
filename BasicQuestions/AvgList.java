//Average of list of numbers
import java.util.*;
class AvgList{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of values");
		int n=sc.nextInt();
		int sum=0, temp=0;
		for(int i=0;i<n;i++){
			sum=sc.nextInt();
			temp=temp+sum;
		}
		double avg=(double)temp/n;
		System.out.println("avgerage of list of values is "+avg);
	}
}