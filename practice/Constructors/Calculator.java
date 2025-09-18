//Usage of constructors for calculator
class Calculator{
	int v1;
	int v2;
	int a, s, mul, d, mod;
	Calculator(int v1, int v2){
		this.v1=v1;
		this.v2=v2;
	}
	public int add()
	{
		a=v1+v2;
		return a;
	}
	public int sub(){
		s=v1-v2;
		return s;
	}
	public int mul(){
		mul=v1*v2;
		return mul;
	}
	public int div(){
		d=v1/v2;
		return d;
	}
	public int modu(){
		mod=v1%v2;
		return mod;
	}
}