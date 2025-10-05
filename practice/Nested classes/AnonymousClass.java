//Anonymous class usage
public class Person{
	void disp(){
		System.out.println("Hello world");
	}
}
public class AnonymousClass{
	public static void main(String[] args) {
		Person p=new Person(){
			void disp(){ //anonymous class and overriding
				System.out.println("Hello groot");
			}
		};
		p.disp();
	}
}