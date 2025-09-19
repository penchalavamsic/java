class MainPerson{
	public static void main(String[] args) {
		System.out.println("****Person****");
		Person p=new Person();
		p.setData("vamsi", 23);
		p.getData();
		System.out.println("***Employee***");
		Employee emp=new Employee();
		emp.setData("lokesh",31,123);
		emp.getData();
	}
}