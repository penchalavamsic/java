//Pangram means all the alphabets should be in the string input
import java.util.*;
class Pangram{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		String s=sc.nextLine().toLowerCase();
		s=s.replaceAll("[^a-z]", "");
		String s1="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<s1.length();i++){
			if(s.indexOf(s1.charAt(i))==-1){
				System.out.println("The string is not a Pangram");
				return;
			}
		}
		System.out.println("The string is a pangram");
	}
}