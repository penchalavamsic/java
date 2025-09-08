class SimpleInterest{
	public static void main(String args[]){
		double principle=Double.parseDouble(args[0]);
		double time=Double.parseDouble(args[1]);
		double rate=Double.parseDouble(args[2]);
		double s_i;
		s_i=(principle*time*rate)/100;
		System.out.println(s_i);
	}

}