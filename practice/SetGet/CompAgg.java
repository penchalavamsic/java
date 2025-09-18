/*Composition and Aggregation: Create a class Address with attributes street, city, and
state. Then create a class Person with attributes name and an Address object. Demonstrate
how to use com Write a Java class representing a Student. Encapsulate the student's name,
age, and grade point average (GPA) with private access modifiers. Provide getter and setter
methods to access and modify these attributes position to model the relationship between a
person and their address*/
class Address{
	String street, city, state;
	Address(String street, String city, String state){
		this.street=street;
		this.city=city;
		this.state=state;
	}
	void display1(){
		System.out.println(street+" "+city+" "+state);
	}
}
class Person{
	String name;
	Address address; //composition relation

	Person(String name, Address address){ //accessing Address class
		this.name=name;
		this.address=address;
	}

	void display2(){
		System.out.println(name);
		address.display1();
	}

}
class Student{
	private String name;
	private int age;
	private double gpa;

	Student(String name, int age, double gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setGpa(double gpa){
		this.gpa=gpa;
	}
	public double getGpa(){
		return gpa;
	}

	void displayStd(){
		System.out.println(name+" "+age+" "+gpa);
	}
}

