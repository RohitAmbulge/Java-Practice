import java.util.Arrays;

public class leetcode {

    public static void main(String[] args) {
        // int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4, 5 };
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        System.out.println(removeDuplicate(arr, val));

    }

    public static int removeDuplicate(int[] arr, int val) {

        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != val) {
                arr[i++] = arr[j];
            }
        }

        System.out.println(Arrays.toString(arr));

        return i;

    }
}