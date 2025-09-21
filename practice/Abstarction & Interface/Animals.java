// Abstarct class for animal sounds
//Method overriding
abstract class Animal{
	abstract void sound();
}
public class Dog extends Animal{
	void sound(){
		System.out.println("Bow bow");
	}
}
public class Cat extends Animal{
	void sound(){
	System.out.println("Meow Meow");
	}
}
public  class Cow extends Animal{
	void sound(){
		System.out.println("Aww Aww");
	}
}
public class Animals{
	public static void main(String[] args) {
		Animal a= new Dog(); //upcasting
		a.sound();
		Animal b=new Cat();
		b.sound();
		Animal c=new Cow();
		c.sound();
	}
}