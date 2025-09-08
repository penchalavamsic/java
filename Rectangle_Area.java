class Rectangle_Area{
	public static void main(String args[]){
		if(args.length<2){
			System.out.println("Provide valid input values");
		}
		Double length=Double.parseDouble(args[0]);
		Double breadth=Double.parseDouble(args[1]);
		System.out.println("Area of rectangle is: "+(length*breadth));
	}
}