import java.util.*;
public class Collections{
    public static void main(String[] args){
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        for(int i:l){
            System.out.println(i);
        }
        //using iterator
        Iterator i=l.iterator();//returns the object
        while(i.hasNext())
            System.out.println(i.next());

    }

}