//reading and writing same file
import java.io.*;
public class RWDemo{
	public static void main(String args[]) throws Exception{
		FileReader fr=new FileReader("RWDemo.java");
		FileWriter fw=new FileWriter("new.txt");
		int x;
		while((x=fr.read())!=-1){
			fw.write(x);
			System.out.print((char)x);
		}
		fw.close();
		fr.close();
	}
}