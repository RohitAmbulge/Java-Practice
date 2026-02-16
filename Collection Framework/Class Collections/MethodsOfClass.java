import java.util.ArrayList;
import java.util.Collections;

public class MethodsOfClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,5,1,9,7,2);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,7,null));
    }
}