/*Define a class of type Student that has rollno, name and age as private data members.
Define SetData() and GetData() as public member functions with appropriate functionality. Write
a program that declares 2 student objects, initializes the first at run-time and second by reading
from console, and then displays both student’s data.*/
import java.util.*;
class Student{
	private int rno;
	private int age;
	private String name;

	public void setDetails(int r, int ag, String n){
		rno=r;
		age=ag;
		name=n;
	}
	void getDetails(){
		System.out.println(rno+" "+age+" "+name);
	}
}
class StudentDetails{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		Student s2=new Student();
		System.out.println("Enter details of Student 1");
		int r=sc.nextInt();
		int ag=sc.nextInt();
		sc.nextLine();
		String n=sc.nextLine();
		s1.setDetails(r, ag, n);
		System.out.println("Enter details of Student 2");
		r=sc.nextInt();
		ag=sc.nextInt();
		sc.nextLine();
		n=sc.nextLine();
		s2.setDetails(r, ag, n);
		s1.getDetails();
		s2.getDetails();

	}
}
