//sum of the digits of a given number until the sum is a single digit
import java.util.*;
class SingleDigitSum{
	  public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = n;

        while (sum > 9) {
            int temp = sum;
            sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        System.out.println(sum);
    }
}