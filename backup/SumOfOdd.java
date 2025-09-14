//Sum of Odd numbers 1-50
//n*n
class SumOfOdd{
	public static void main(String args[]){
		int sum=0;
		for(int i=1;i<=50;i=i+2){
			sum=sum+i;
		}
		
		System.out.println("Sum of odd numbers upto 50 is "+sum);

	}
}