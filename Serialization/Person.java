//Person data for serialization
import java.io.*;
public class Person implements Serializable{ //using serializable
	private String name;
	private int id;
	private long Aadhar;
	Person(String name, int id, long Aadhar){
		this.name=name;
		this.id=id;
		this.Aadhar=Aadhar;
	}
	@Override
	public String toString(){
		return "Name: "+name+"ID: "+id+"Aadhar: "+Aadhar;
	}
}