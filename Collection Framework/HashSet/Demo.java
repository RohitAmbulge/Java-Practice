import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(34);
        set.add(0);
        set.add(-56);
        
        System.out.println(set.add(-28));
        System.out.println(set.add(-28));
        // set.add(-28);
        set.add(null);
        set.add(null);

        System.out.println(set);
    }
}