//TrafficLightSystem
import java.util.*;
class TrafficLightSystem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose R, Y, G");
		char a=sc.next().charAt(0); //next() returns string so we convert it into char
		switch(a){
		case 'R':System.out.println("Stop");
			break;
		case 'Y':System.out.println("Wait");
			break;
		case 'G':System.out.println("Go");
			break;
		default:System.out.println("Invalid Choice");

		}
	}
}