//List operations
import java.util.*;
public class List_LL{
    public static void main(String[] args) {
        //creating linkedlist
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Chennai");
        ll.add("Bangalore");
        ll.add("Mumbai");
        ll.add("Delhi");
        ListIterator<String>itr=ll.listIterator();
        while(itr.hasNext()){
            //avoiding casting to string
            String str=itr.next();
            if(str.equals("Bangalore"))
                itr.remove();
            if(str.equalsIgnoreCase("Mumbai")){
                itr.set("Pune");
            }
        }
        System.out.println(ll);

    }
}