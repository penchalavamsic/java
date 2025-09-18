//Person class with attributes
class Person{
	int name;
	int age;
	String country;

	public void setDetails(int name, int age, String country){
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public void getDetails(){
		System.out.println(name+" "+age+" "+country);
	}
	Person(){ //Default constructor
		name=0;
		age=0;
		country=null;
	}
	Person(int n, int a, String c){ //parameterized constructor
		name=n;
		age=a;
		country=c;
	}
	void display(){
		System.out.println(name+" "+age+" "+country);
	}

}