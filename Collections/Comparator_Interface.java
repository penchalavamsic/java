
import java.util.*;

class CompImpl implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

    public int compare1(Integer o1, Integer o2) {
        if (o1 % 10 > o2 % 10) { //finds the last digit of the number
            return compare1(o1, o2);
        }
        return -1;
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
        Comparator<Integer> c1 = new CompImpl();
        Collections.sort(values, c1);
        System.out.println(values);
    }

}
