//Nested class usage
public class Outer{ //ouer class
	int a=10; 
	class Inner{
		void msg(){
			System.out.println("Inner class with outer class value  "+a); //inner class
		}
	}
void disp(){ //outer method
	System.out.println("Outer class");
	}	
}
public class SimpleNestedClass{
	public static void main(String[] args) {
		Outer o=new Outer(); //outer class
		Outer.Inner i= o. new Inner(); //inner class -> OuterClass.InnerClass name=OuterObj.new Inner();
		i.msg();
		o.disp();
	}
}