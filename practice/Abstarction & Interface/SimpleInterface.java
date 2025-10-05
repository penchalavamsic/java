//Simple interface usage
interface Test{
	final int a=10; //static constant
	void display();
}
class hello implements Test{ //implements
	public void display(){
		System.out.println("Hello world");
	}
}
public class SimpleInterface{
	public static void main(String[] args) {
		Test ab=new hello();
		ab.display();
		System.out.println(ab.a);
	}
}