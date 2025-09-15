//Searching an element in an array
import java.util.*;
class ElementSeacrh{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={1,5,88,6};
		int element=arr[0];
		System.out.println("Enter element");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				System.out.println("The element "+arr[i]+" found at "+i);
				return; //exit program immediately
			}
			
		}	
	System.out.print("The element not found in array");
	}
}