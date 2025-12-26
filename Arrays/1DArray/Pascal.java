import java.util.ArrayList;
import java.util.List;

public class Pascal {

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                subList.add(1);
            }
            list.add(subList);
        }

        // System.out.println(list);
    }
}