import java.util.*;

public class IteratorInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        // System.out.println(list);

        Iterator<String> it = list.iterator();

        while(it.hasNext())
        {
            String e = it.next();

            System.out.println(e);

            if(e.equals("Python")){
                list.add("jf");
            }

        }

        System.out.println("After removal : "+list);
    }
}