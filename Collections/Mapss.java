import java.util.*;
public class Mapss {
    public static void main(String[] args) {
        Map<String, String> m=new HashMap<>();
        m.put("1","A"); //we should pass key and value
        m.put("2","B");
        m.put("3","C");
        for(String i:m.values()) //keyset returns the keys of the map
            System.out.println(i);
        System.out.println(m.get("1"));//getting particular key value only 
        
    }
}
