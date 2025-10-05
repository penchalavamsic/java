//Sample class
class Sample{
	int rollno;
	String name;
	int age;
	public void setDetails(int r, String n, int a){
		rollno=r;
		name=n;
		age=a;
	}
	public void getDetails(){
		System.out.println(rollno+" "+name+" "+age);
	}
}