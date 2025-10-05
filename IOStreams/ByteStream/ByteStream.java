//ByteStream
//copies hello.txt content into Hru.txt files
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class ByteStream{
	public static void main(String[] args)throws IOException {
		FileOutputStream file=new FileOutputStream("hello.txt"); //creation of file
		String content="Hello world";
		file.write(content.getBytes()); //writing into the hello.txt file
		FileInputStream in=null;
		FileOutputStream out=null;
		try{
			in=new FileInputStream("hello.txt");
			out=new FileOutputStream("Hru.txt");
			int c;
			while((c=in.read())!=-1){
				out.write(c);
			} //.read() reads one byte and return int value and -1 if end of file reached

			}finally{
				if(in !=null){
					in.close();
				}
				if(out!=null){
					out.close();
				}
			}
		}
}