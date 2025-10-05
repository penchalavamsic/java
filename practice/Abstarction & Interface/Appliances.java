//Appliances using abstarct class
//power consumption=(power *time )/1000
public abstract class Appliance{
	static String brand="Samsung"; //static
	double power;
	double consumption;
	int time;
	Appliance(double power, int time){ //constructor for taking inputs
		this.power=power;
		this.time=time;
	}
 abstract void turnOn();
}
public class WashingMachine extends Appliance{
	WashingMachine(double power, int time){
	super(power, time); //calling abstract class constructor using super
}
	@Override
	void turnOn(){
		consumption=(power*time)/1000;
		System.out.println(brand+" "+consumption);
	}
}
public class Refrigerator extends Appliance{
	Refrigerator(double power, int time){
	super(power, time);
}
	@Override
	void turnOn(){
		consumption=(power*time)/1000;
		System.out.println(brand+" "+consumption);
	}
}
public class Microwave extends Appliance{
	Microwave(double power, int time){
	super(power, time);
}
	@Override
	void turnOn(){
		consumption=(power*time)/1000;
		System.out.println(brand+" "+consumption);
	}
}
public class Appliances{
	public static void main(String[] args) {
		Appliance a=new WashingMachine(100.5, 5); //upcasting
		a.turnOn();
		Appliance b=new Refrigerator(120.6, 12);
		b.turnOn();
		Appliance c=new Microwave(250.6, 4);
		c.turnOn();
	}
}