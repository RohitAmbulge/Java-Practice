import java.util.Arrays;

public class InsertEleAtIndex {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 7, 8, 9 };

        int ele = 100;
        int ind = 4;
        int[] ans = insertAtIndex(arr, ele, ind);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] insertAtIndex(int[] arr, int val, int ind) {
        int[] ans = new int[arr.length + 1];
        // 0 1 2 3 4 5 6
        if (ind >= 0 && ind < arr.length) { // { 2, 3, 4, 6, 7, 8, 9 }
            for (int i = arr.length - 1; i >= 0; i--) { // 5
                if (i >= ind) { // 4 > 4
                    ans[i + 1] = arr[i]; // [0,0,0,0,0,0,8,9]
                }
                if (i == ind)
                    ans[i] = val;
                if (i < ind) {
                    ans[i] = arr[i];
                }
            }
        }

        return ans;
    }
}