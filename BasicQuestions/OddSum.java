//Sum of odd numbers between 1 to 50
class OddSum{
	public static void main(String args[]){
		int sum=0;
		for(int i=1;i<=50;i=i+2){
			sum=sum+i;
		}
		System.out.print("sum of odd numbers between 1 to 50 is "+sum);
	}
}