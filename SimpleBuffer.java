//simple buffer reader example using readline()
import java.io.*;
public class SimpleBuffer{
    public static void main(String[] args) throws  IOException{ //declaring exception
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        try{
        String name=br.readLine(); //reads line
        int age=Integer.parseInt(br.readLine()); //converst "30" to 30
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}