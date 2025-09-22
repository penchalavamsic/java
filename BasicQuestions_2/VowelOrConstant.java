//Vowel or constant 
import java.util.*;
class VowelOrConstant{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char a=sc.next().charAt(0);
		if(a>='a'&&a<='z'||a>='A'&&a<='Z'){
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
				System.out.println(a+"is a Vowel");
			}
			else{
				System.out.println(a+"is a constant");
			}
		}
		else{
			System.out.println("Give a valid input");
		}	
	}
}


	