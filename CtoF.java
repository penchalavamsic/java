class CtoF{
	public static void main(String args[]){
		System.out.println("Enter celsius value");
		double celsius=Double.parseDouble(args[0]);
		double farenheit=(celsius*(9.0/5.0))+32;
		System.out.println("farenheit is: "+farenheit);
	}
}