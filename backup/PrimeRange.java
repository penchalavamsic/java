//Prime numbers sum from 1 to 100
class PrimeRange{
	public static void main(String args[]){
		int temp=0, n;
		for(n=1;n<=100;n++){
			int c=0;
			for(int i=1;i<=n;i++){

				if(n%i==0){
					c++;
				}
			}
			
		if(c==2){
			temp=temp+n;

			}
		}
	System.out.println("Sum of primes numbers is "+temp);
	}
}