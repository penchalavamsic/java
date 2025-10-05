//V=(4/3) * π * r^3
class SphereVolume{
	public static void main(String args[]){
		double radius=Double.parseDouble(args[0]);
		System.out.println("Using built-in constant");
		double volume=(4/3)*(Math.PI)*(radius*radius*radius);
		System.out.println("volume of sphere is: "+volume);
	}

}