//Simple abstarction usage
public abstract class Remote{
	abstract void On(); //only siagnatures
	abstract void Off();
}
public class Control extends Remote{ //extends for abstarction subclass
	@Override
	void On(){
		System.out.println("TV is on");
	}
	@Override
	void Off(){
		System.out.println("TV is off");
	}
}
class SimpleAbstraction{
	public static void main(String[] args) {	
	Remote r=new Control(); //upcasting and creating object for sub class access
	r.On();
	r.Off();	
	}
}