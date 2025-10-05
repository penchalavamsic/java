//formula A=P*(1+r/n)^(n*t)
//compound interest
class CompoundInterest{
	public static void main(String args[]){
		double principle=Double.parseDouble(args[0]);
		double time=Double.parseDouble(args[1]);
		double rate=Double.parseDouble(args[2]);
		double n=Double.parseDouble(args[3]);
		double c_i;
		double a=(1+(rate/n));
		double b=n*time;
		c_i=principle*Math.pow(a, b);
		System.out.println(c_i);

	}
}