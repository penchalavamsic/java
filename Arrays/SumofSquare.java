//Sum of squares of odd index values in an array

import java.util.*;
class SumofSquare{
	public static void main(String[] args) {
		int arr[]={1,5,6,8,4};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(i%2!=0){
					sum+=Math.pow(arr[i], 2);
			}
		}
		System.out.println(sum);
	}
}