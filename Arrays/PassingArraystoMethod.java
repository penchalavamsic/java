//sum of array values using passign array to methods
class PassingArraystoMethod{
	public static void main(String args[]){
		int arr[]={1,2,3,4};
		sum(arr);
	}
	public static void sum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("The sum of array values is "+sum);
	}

}