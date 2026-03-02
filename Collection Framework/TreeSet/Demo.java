import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        // TreeSet<Integer> set = new TreeSet<>();
        // set.add(29);
        // set.add(10);
        // set.add(20);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(15);

        TreeSet set2 = new TreeSet(list);
        System.out.println(set2);

        Comparator<Integer> c = (a,b)->b-a;
        TreeSet<Integer> set3 = new TreeSet<>(c);
        set3.add(3);
        set3.add(4);
        set3.add(9);
        set3.add(5);
        System.out.println(set3);

    }
}