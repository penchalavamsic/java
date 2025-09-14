//A perfect square is a number that is the square of an integer.
import java.util.*;
class PerfectSquare{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int p_sqr=(int)Math.sqrt(n);
		if((p_sqr*p_sqr)==n){
			System.out.println("Perfect Square number");
		}
		else{
			System.out.println("Not a perfect Square number");
		}
	}
}