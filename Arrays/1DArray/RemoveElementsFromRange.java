import java.util.Arrays;

public class RemoveElementsFromRange {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 9, 5, 6, 7, 8, 4 }; // 8
        // 0 1 2 3 4 5 6 7
        int start = 2;
        int end = 4;

        int[] ans = removeElement(arr, start, end);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] removeElement(int[] arr, int start, int end) {
        int diff = end - start + 1;

        int[] ans = new int[arr.length - diff];

        for (int i = 0; i < arr.length; i++) {
            if (i < start) {
                ans[i] = arr[i];
            } else if (i > end) {
                ans[i - diff] = arr[i];
            }

        }

        return ans;
    }
}