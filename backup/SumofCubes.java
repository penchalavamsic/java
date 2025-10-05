//Sum of cubes ((n(n+1))/2)^2 from 1 to 10
class SumofCubes{
	public static void main(String args[]){
		int n=10;
		int value=(int)(n*(n+1))/2;
		int power=(int)Math.pow(value, 2);
		System.out.println("Sum of cubes of 1 to 10 is "+power);
	}
}