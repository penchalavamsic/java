//Parameterized Constructor
class Parameterized{
	int id;
	String name;
	Parameterized(int id, String name){
		//id=id; //overhidden happen > 0
		//name=name; //over hidden happen > null
		this.id=id;
		this.name=name; 
	}
public static void main(String[] args) {
	Parameterized p=new Parameterized(20, "Vamsi");
	System.out.print(p.id+" "+p.name);
	}
}