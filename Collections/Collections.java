import java.util.*;
public class Collections{
    public static void main(String[] args){
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(0,1);//by indexing
        for(int i:l){
            System.out.println(i);
        }
        List<Integer> l1=new ArrayList<>();
        l1.add(40);
        l1.add(50);
        l.addAll(l1);//adding another list
        java.util.Collections.sort(l);//sorting
        //using iterator
        Iterator i=l.iterator();//returns the object
        while(i.hasNext())//check next element
            System.out.println(i.next());

    }

}