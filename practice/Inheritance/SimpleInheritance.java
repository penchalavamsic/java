//Simple usage of inheritance
//Hierarichal inheritance
class Animal{ //parent class
	String a="in";
	void sound(){
		System.out.println("Animals are included "+a+" nature");
	}
}
//using extends for accesing parent class
class Dog extends Animal{
	void sound(){
		System.out.println("Dog barks "+a+" on roads"); //accesing parent class instance variables
	}
}
class cat extends Animal{
	void sound(){
		System.out.println("cat meows "+a+" house");
	}
}
class SimpleInheritance{
	public static void main(String[] args) {
		Animal an= new Animal();
		an.sound();
		Dog d=new Dog();
		d.sound();
		cat c=new cat();
		c.sound();
	}
}
