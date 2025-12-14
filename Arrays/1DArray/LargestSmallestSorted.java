import java.util.Arrays;

public class LargestSmallestSorted {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7 };

        Arrays.sort(arr);
        System.out.println("First Small : " + arr[0]);
        System.out.println("First Large : " + arr[arr.length - 1]);
        System.out.println("Small : " + smallest(arr));
        System.out.println("Large : " + largest(arr));
    }

    public static int smallest(int[] arr) {
        int small = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != small) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int largest(int[] arr) {
        int max = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != max) {
                return arr[i];
            }
        }
        return -1;
    }
}