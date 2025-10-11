//Array list
import java.util.*;
public class ArrayList_A {
    public static void main (String args[]){
        ArrayList<Integer> al=new ArrayList<Integer>(); //generics
        al.add(10);
        al.add(1);
        al.add(56);
        System.out.println(al);
        Collections.sort(al); //sorting
        System.out.println(al);
        System.out.println("****");
        //normal for each
        for(Object obj:al){
            System.out.println(obj);// printing elements
        }
        System.out.println("****");
        //using iterator
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()); //printing elements
        }

    }
}