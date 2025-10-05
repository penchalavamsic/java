//Sum and average of elements in an array
import java.util.*;
class SumandAvg{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter values into an array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		double sum=0;
		double avg=0.0;
		for(int j=0;j<n;j++){
			sum+=arr[j];
		}
		System.out.println("Sum of array values is "+sum);
		System.out.println("Average of array values is "+(sum/n));
	}
}