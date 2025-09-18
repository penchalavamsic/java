//Usage of parameterized constructor for rectangle area and perimeter
//area=l*b
//perimeter=2*(l+b)
class Rectangle{
	int length;
	int width;
	int a, p;
	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	public void area(){
		a=length*width;
	}
	public void getarea(){
		System.out.println("Area is "+a);
	}
	public void perimeter(){
		p=2*(length+width);
	}
	public void getperimeter(){
		System.out.println("Perimeter is "+p);
	}
}