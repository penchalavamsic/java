//Area of Triangle
//s=(a+b+c)/2
//Area=sqrt(s*(s-a)*(s-b)*(s-c))
//s=semi perimeter
class AreaOfTriangle{
	public static void main(String args[]){
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);
		double s=(a+b+c)/2;
		double temp=(s*(s-a)*(s-b)*(s-c));
		double area=Math.sqrt(temp);
		System.out.println(area);
	}
}
//If output is NaN, it doesnt form a triangle.
//Ex 10 20 5 o/p is Nan 