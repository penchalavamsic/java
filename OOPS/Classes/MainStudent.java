//getter, setter, object, classes creation
import java.util.*;
class Student{
	private int rollno;
	private String name;
	private int age;

	public void setValues(int r, int a, String n){ //setting values
		rollno =r;
		age=a;
		name=n;
	}
	public String getValues1(){ //getvalues to setter
		return name;
	} 
	public int getRoll(){
		return rollno;
	}
	public int getAge(){
		return age;
	}
}
public class MainStudent{
	public static void main(String[] args) {
	Student sc= new Student(); //object creating for Stduent class members
	sc.setValues(68, 20, "hari");
	System.out.println(sc.getValues1());
	System.out.println(sc.getRoll());
	System.out.println(sc.getAge());
	}
}
