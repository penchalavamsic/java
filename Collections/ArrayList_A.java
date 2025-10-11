//Array list
import java.util.*;
public class ArrayList_A {
    public static void main (String args[]){
        ArrayList<Integer> al=new ArrayList<Integer>(); //generics
        al.add(10);
        al.add(1);
        System.out.println(al);
        Collections.sort(al); //sorting
        System.out.println(al);


    }
}