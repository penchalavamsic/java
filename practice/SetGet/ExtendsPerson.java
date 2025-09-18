//Extends person class and using default and parameterized constructors
class ExtendsPerson extends Person{
	public static void main(String[] args) {
		Person p=new Person();
		Person p1=new Person(10, 23, "America");
		p.display();
		p1.display();
	}
}