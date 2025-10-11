//Sets
import java.util.*;
public class Sets{
    public static void main (String args[]){
        Set s=new HashSet(); //creating HashSet
        s.add(10);
        s.add("Hi");
        s.add(10); //compiler ignores duplicates
        System.out.println(s);
    }
}