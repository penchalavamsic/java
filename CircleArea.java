class CircleArea{
	public static void main(String args[]){
		System.out.println("Enter radius");
		double radius=Double.parseDouble(args[0]);
		double area=(3.1415)*((radius*radius));
		System.out.println("Area of circle is: "+area);
		System.out.println("Using built-in constant");
		area=Math.PI*(radius*radius);
		System.out.println("Area of circle is: "+area);

	}
}