//Revesing elements in an array
import java.util.*;
class ReverseArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=(int)(Math.random()*(100-10+1))+10; //using random method
		}
		for(int i=n-1;i>=0;i--){
			System.out.print(arr[i]+" "); 
		}
	}
}