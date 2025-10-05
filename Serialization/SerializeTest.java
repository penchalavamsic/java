//Serialization implementation
import java.io.*;
public class SerializeTest {
	public static void main(String args[]) throws Exception{
		Person p1=new Person("ABC", 12, 75238365156l);
		//Serialization
		FileOutputStream fos=new FileOutputStream("person.data");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p1);
		//De-serialization
		FileInputStream fis=new FileInputStream("person.data");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person p2=(Person)ois.readObject(); //return object

		System.out.println(p2);
		oos.close();
	}
}