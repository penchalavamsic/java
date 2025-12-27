import java.util.*;
public class Setss {
    public static void main(String[] args) {
        Set<Integer> values=new HashSet<>(); //doesnt allow duplicate values
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        values.add(50);
        values.add(50); //duplicate value
        for(int i:values)
            System.out.println(i);
    }
}
