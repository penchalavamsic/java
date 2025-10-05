import java.io.*;
public class FileWriting {
	public static void main(String args[])throws IOException{
	File f=new File("Sample.txt"); //file creation
	//FileWriter fw=new FileWriter("Sample.txt", true) another type and true is for appending
	FileWriter fw=new FileWriter(f); //file writer
	fw.write("Hello World"); //content
	fw.write("I am computer");
	fw.close(); //closing
	}
}