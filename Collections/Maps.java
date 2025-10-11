//Map collection
import java.util.*;
public class Maps{
    public static void main(String[] args) {
        Map<Integer, String> m=new HashMap<>(); //random order with HashMap
        m.put(5,"A");
        m.put(2,"B");
        m.put(3,"C");
        System.out.println(m);
        System.out.println("***");
        //to get keys
        Collection c1=m.keySet();
        System.out.println(c1);
        //prints key and values together as a set
        Set s=m.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println("***");
        //to get values
        Collection c2=m.values();
        System.out.println(c2);

        
    }
}