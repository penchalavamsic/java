//To check a string is palindrome or not
import java.util.*;
class Palindrome_String{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		str=str.toLowerCase(); //converting to lower case
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i); //separating and storing
		}
		if(str.equals(rev)){
			System.out.println(str+" is a palindrome");
		}
		else{
			System.out.println(str+" is not a palindrome");
		}

	}
}