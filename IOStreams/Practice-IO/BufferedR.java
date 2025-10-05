//Buffered Reader
import java.io.*;
public class BufferedR{
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("Sample.txt"));
		int x;
		int count=0;
		while((x=br.read())!=-1){
			System.out.print((char)x);
			count++;
		}
		br.close();
	}
}