//calling a parent constructor from child class constructor
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
}
class Employee extends Person{
	int id;
	Employee(String n, int a, int id){
		super(n, a); //calling parent constructor from child constructor
		this.id=id;
	}
	void display(){
		System.out.println(name+" "+age+" "+id);
	}
}