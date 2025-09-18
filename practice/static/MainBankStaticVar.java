class MainBankStaticVar{
	public static void main(String[] args) {
		Bank b=new Bank();
		b.setDetails(123456, 50000);
		b.setDeposits(10000);
		b.getDetails();
		b.withdraw();
		b.display();
	}
}