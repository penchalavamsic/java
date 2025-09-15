//Nth largest and smallest element
import java.util.*;
class NthLargeSmall{
	public static void main(String[] args) {
		int []arr={10,1,5,8,7};
		int n=2;
		Arrays.sort(arr);
		System.out.println("Nth smallest number is "+arr[n-2]);
		System.out.println("Nth Largest number is "+arr[n-1]);
	}
}