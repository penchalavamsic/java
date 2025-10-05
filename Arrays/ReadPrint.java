//Reading and printing values of array
import java.util.*;
class ReadPrint{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter elements into array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Printing elements of array");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}