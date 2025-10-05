/*Create a class Person with attributes name, age and country. Implement methods to set
and get these attributes. Create an object of this class, set its attributes, and print out the
details.*/
import java.util.*;
class Person{
	String name;
	String country;
	int age;
	public void setDetails(String n, String c, int a){
		name=n;
		country=c;
		age=a;
	}
	void getDetails(){
		System.out.println(name+" is from "+country+" having age of "+age);
	}
}
class PersonDetails{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details");
		String n=sc.nextLine();
		String c=sc.nextLine();
		int a=sc.nextInt();
		Person p=new Person();
		p.setDetails(n, c, a);
		p.getDetails();

	}
}