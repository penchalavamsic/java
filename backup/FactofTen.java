//Factorial of first 10 numbers
class FactofTen{
	public static int Fact(int n){
		if(n==1)
			return 1;
		else
			return n*Fact(n-1);
	}
	public static void main(String args[]){
		int a=10;
		for(int i=1;i<=a;i++){
			System.out.println(Fact(i));
		}

	}
}