//Comparator for change default order in TreeSet
import java.util.*;
public class Comparator_Sets{
    public static void main(String args[]){
        Set<String> s=new TreeSet<String>(new MyClass());
        s.add("I");
        s.add("j");
        s.add("T");
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("****");
        class MyClass implements Comparator<String>{
            public int compare(String s1String, String s2String){
                return s2String.compareTo(s1String); //for descending order
            }
        }

    }
    
}