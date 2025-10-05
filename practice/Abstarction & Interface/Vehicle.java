//vehicle using interface implementation
interface V{
	void startEngine();	//default method
}
class Car implements V{ //implements
	@Override
	public void startEngine(){
		System.out.println("Start Engine");
	}
}
class Car1 implements V{
	@Override
	public void startEngine(){ //overriding the method
		System.out.println("Engine Stops");
	}
}

public class Vehicle{
	public static void main(String[] args) {
		V veh=new Car(); //upcasting
		veh.startEngine();
		V veh1=new Car1();
		veh1.startEngine();
	}
}