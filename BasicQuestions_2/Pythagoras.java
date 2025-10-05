//Pythagoras Theorem
class Pythagoras{
	public static void main(String args[]){
		System.out.println("Enter Perpendicular and Base values");
		double perpendicular=Double.parseDouble(args[0]);
		double base=Double.parseDouble(args[1]);
		double c;
		c=((perpendicular*perpendicular)+(base*base));
		double hyp=Math.sqrt(c);
		System.out.println(hyp);
	}
}