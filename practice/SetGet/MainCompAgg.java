//Main class for composition and aggregation
class MainCompAgg{
	public static void main(String[] args) {
		Address a=new Address("123", "Nellore", "AP");
		Person p=new Person("vamsi", a);
		a.display1();
		p.display2();
		System.out.println("******");
		Student s=new Student("Hari", 23, 8.5);
		s.displayStd();
	}
	
}