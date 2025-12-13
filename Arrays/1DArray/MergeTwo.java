import java.util.Arrays;

public class MergeTwo {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 6, 7, 8, 9 };

        int[] newArr = new int[arr1.length + arr2.length];

        int ind = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArr[ind++] = arr1[i];
            newArr[ind++] = arr2[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}