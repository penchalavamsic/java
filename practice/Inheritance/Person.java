//Person method overloading 
class Person{
	String name;
	int age;
	public void setData(String n, int a){
		name=n;
		age=a;
	}
	public void getData(){
		System.out.println(name);
		System.out.println(age);
	}
}
class Employee extends Person{
	int empId;
	public void setData(String n, int a, int e){ //overloading with diff signatures
		super.setData(n, a); //calling parent class method
		empId=e;
	}
	@Override
	public void getData(){
		super.getData();
		System.out.println(empId);
	}
}