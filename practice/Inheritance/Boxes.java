//Usage of super()
class Box{
	double length;
	double breadth;
	double height;
	double area, volume;
	Box(double length, double breadth, double height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public void area(){
		area=length*breadth;
		System.out.println(area+" is the area of box");
	}
}
class Box3 extends Box{
	Box3(double length, double breadth, double height){ //getting parent class members
		super(length, breadth, height); //calling parent using super
	}
	public void volume(){
		volume =length*breadth*height;
		System.out.println(volume+" is the volume of box");
	}
}

