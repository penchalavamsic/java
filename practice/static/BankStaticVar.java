//Static variable and static block for Bank
class Bank{
	int accno;
	int balance;
	static double interest=5.2;
	int amount;

	static{ //static block
		int accno;
		int balance;
		double interest;
	}
	public void setDetails(int accno, int balance){
		this.accno=accno;
		this.balance=balance;
	}
	public void setDeposits(int amount){
		this.amount=amount;
	}
	public void getDetails(){
		System.out.println(accno+" "+balance+" "+interest);	
	}
	public void withdraw(){
		int i=(int)(amount*interest)/100; //interest on deposit
		balance=balance+i+amount;
	}
	public void display(){
		System.out.println("****");
		System.out.println(accno+" "+balance+" "+interest);
	}

	public static void interest(double newInterest){ //static method
		System.out.println("********");
		interest=newInterest;
		System.out.println(interest);

	}
}