//Simple usage of Multilevel inheritance
//constructor triggering
class Animal{ //parent class
	String a="in";
	Animal(){
		System.out.println("Animals are included "+a+" nature");
	}
}
//using extends for accesing parent class
class Dog extends Animal{
	Dog(){
		System.out.println("Dog barks "+a+" on roads"); //accesing parent class instance variables
	}
}
class cat extends Dog{
	cat(){
		System.out.println("cat meows "+a+" house");
	}
}
class MultilevelInheritance{
	public static void main(String[] args) {
		cat c=new cat(); //here it triggers all the constructors of parent class as super() is implicity given by compiler
		
	}
}
