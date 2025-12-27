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

        Set<Integer> v=new TreeSet<>(); //sorted in ascending order
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(50); //duplicate value
        for(int j:v)
            System.out.println(j);
    }
}
