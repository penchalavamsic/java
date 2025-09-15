//Sum of first and second halfs of array
class FirstSecondSum{
	public static void main(String[] args) {
		int arr[]={5,6,8,7,9};
		int len=arr.length;
		int sum1=0, sum2=0;
		int middle=len/2;
		for(int i=0;i<middle;i++){
				sum1+=arr[i];
		}
		for(int i=middle;i<len;i++){
				sum2+=arr[i];
		}
		System.out.println("Sum of first half of array is "+sum1);
		System.out.println("Sum of second half of array is "+sum2);
	}
}