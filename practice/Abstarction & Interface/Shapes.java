//Interface with inheritance
interface Shape{
	void draw();
	double calculateArea();
}
interface Colorful extends Shape{
	void fillColor(String color);
}
class Circle implements Shape, Colorful{

	double radius;
	Circle(double radius){
	this.radius=radius;
	}

	@Override
	public void draw(){
		System.out.println("Drawing circle with radius "+radius);
	}
	@Override
	public double calculateArea(){
		return Math.PI*radius*radius;
	}
	@Override
	public void fillColor(String color){
		System.out.println("Filling color with color "+color);
	}
}
public class Shapes{
	public static void main(String[] args) {
			Circle c=new Circle(5);
			c.draw();
			System.out.println("Area is "+c.calculateArea());
			c.fillColor("Red");
	}
}