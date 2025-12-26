import java.util.*;

class CompImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) { 
        return o1.compareTo(o2);
    }
}

public class Comparator_Interface {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(102);
        values.add(208);
        values.add(156);
        values.add(52);

        Comparator<Integer> c = new CompImpl();
        Collections.sort(values, c);  
        System.out.println(values);
    }
}
