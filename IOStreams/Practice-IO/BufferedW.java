//Buffered Writer
import java.io.*;
public class BufferedW{
	public static void main(String args[]) throws Exception{
		//wrapping the File Writer class
		BufferedWriter bw=new BufferedWriter(new FileWriter("Sample.txt", true)); //using anonymous objects

		bw.write("Hi, namstey");
		bw.close();
	}
}