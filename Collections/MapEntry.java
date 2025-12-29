import java.util.*;
public class MapEntry{
    public static void main(String[] args) {
        Map<String, String>m=new HashMap<>();
        m.put("1","A");
        m.put("2","B");
        m.put("3","C");
        //we get key and value
        //used set for unique values
        Set<Map.Entry<String, String>>s=m.entrySet();
        for(Map.Entry<String, String> e:s)
            System.out.println(e.getKey()+" "+e.getValue());
    }
}