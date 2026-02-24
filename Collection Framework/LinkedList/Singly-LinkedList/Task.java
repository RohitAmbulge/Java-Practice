import java.util.*;


public class Task{
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();

        list.add(10);
        list.add("kjscd");
        list.add(20);
        list.add(123.123);
        list.add('a');
        list.add(30);
        list.add(false);
        list.add(40);

        ListIterator it= list.listIterator();

        for(it.hasNext()){
            System.out.println(it.next());
        }

        // System.out.println(list);
    }
}