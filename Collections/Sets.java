//Sets
import java.util.*;
public class Sets{
    public static void main (String args[]){
        Set s=new HashSet(); //creating HashSet with random order
        s.add(10);
        s.add("Hi");
        s.add(10); //compiler ignores duplicates
        System.out.println(s);
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Set s1=new LinkedHashSet(); //with Insertion order
        s1.add(10);
        s1.add("Hello");
        s1.add("22");
        Iterator itr1=s1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}