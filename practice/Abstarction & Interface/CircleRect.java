//Circle and rectangle area using abstarction
public abstract class Shape{
	abstract double area();

}
public class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double area(){ //abstract method
		return Math.PI*radius*radius;
	}

}
public class Rectangle extends Shape{
	double length, breadth;
	Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double area(){
		return length*breadth;
	}
}

public class CircleRect{
	public static void main(String[] args) {
		Shape c=new Circle(10); //abstract class instanciation
		System.out.println(c.area());
		Shape r=new Rectangle(5, 6);
		System.out.println(r.area());
	}
}