class MainCal{
	public static void main(String[] args) {
		Calculator c=new Calculator(10, 20);
		//calling and displaying results
		System.out.println(c.add()); 
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		System.out.println(c.modu());
	}
}