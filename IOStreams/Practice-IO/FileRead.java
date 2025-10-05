//File reading
import java.io.*;
public class FileRead{
	public static void main(String args[]) throws Exception{
		FileReader fr=new FileReader("Sample.txt");
		int x; //file reader returns int value
		int count=0;
		while((x=fr.read())!=-1){ //checking upto last value
			System.out.print((char)x); //typecasting
			count++;//finding no of characters
		}
		System.out.println(count);
		fr.close();
	}
}