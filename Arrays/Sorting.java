//Sorting elements in array
//Using sort()method
import java.util.*;
class Sorting{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=(int)(Math.random()*(100-10+1)+10);
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}