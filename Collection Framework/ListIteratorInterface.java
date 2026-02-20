import java.util.*;

public class ListIteratorInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        } 


        System.out.println("----------");

        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

        while(lit.hasNext()){
            String val = lit.next();

            if(val.equals("B")){
                lit.add("x");
            }
        }

        System.out.println(list);
    }
    
}