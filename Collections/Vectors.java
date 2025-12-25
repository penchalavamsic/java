import java.util.*;
public class Vectors{
    public static void main(String[] args){
        //dynamically increases vector, default capacity is 10
        Vector v=new Vector();
        v.add(10);
        v.add(30);
        //v.remove(10);
        v.removeElement(10);
        System.out.println(v);

    }
}