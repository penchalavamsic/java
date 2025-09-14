//Sum of even numbers 1-50
class SumOfEven{
	public static void main(String args[]){
		int sum=0;
		for(int i=2;i<=50;i=i+2){
			sum=sum+i;
		}
		
		System.out.println("Sum of even numbers upto 50 is "+sum);

	}
}