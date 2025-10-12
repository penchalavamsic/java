
import java.lang.reflect.*;

//Gernerics 
public class ReflectionsDemo{
   
    public static void main(String args[]){
         int mcount=0;
        int fcount=0;
        Object o=new String("Java"); // object is parent to all classes
        Class c= o.getClass(); //entry point to reflection
        System.out.println(c.getName()); //java.lang.String
        Method[] m=c.getDeclaredMethods();
        Field[] f=c.getDeclaredFields();
        for(Method m1:m){
            mcount++;
            System.out.println(m1.getName());
        }
        System.out.println("No of Methods "+mcount);
        System.out.println("********");

        for(Field f1:f){
            fcount++;
            System.out.println(f1.getName());
        }
        System.out.println("No of Fields "+fcount);
    
    }

}