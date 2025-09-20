//calling parent method with child class object
class Parent{
	public void disp(){
		System.out.println("This is Parent class");
	}
}
class Child extends Parent{ //inheriting methods of parent class
	public void disp1(){
		System.out.println("This is child class");
	}
}
class ParentChild{
	public static void main(String[] args) {
		Parent p=new Parent();
		p.disp();
		Child c=new Child();
		c.disp1();
		c.disp(); //calling parent class with child
	}
}