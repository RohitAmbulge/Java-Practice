
import java.util.TreeSet;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(10);
        tree.add(50);
        tree.add(40);
        tree.add(90);
        tree.add(20);
        tree.add(40);
        // tree.add(null);

        System.out.println(tree.getClass());

        tree.addAll(Arrays.asList(90,34,26,48));

        System.out.println(tree);

        // System.out.println(tree.ceiling(-3));
        // System.out.println(tree.floor(50));

        // tree.addFirst(58); not possible Throws UnsupportedOperationException. 

        // System.out.println(tree.contains(45));
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.higher(45));
        System.out.println(tree.lower(45));
        System.out.println("Poll first : "+tree.pollFirst());
        System.out.println("Poll last : "+tree.pollLast());

         System.out.println(tree);

    }
}