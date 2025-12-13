import java.util.Arrays;

public class MergeTwoDiff {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 7, 8, 9 };

        int[] newArr = new int[arr1.length + arr2.length];
        int maxLen = (arr1.length > arr2.length) ? arr1.length : arr2.length;

        int ind = 0;
        for (int i = 0; i < maxLen; i++) {
            if (i < arr1.length) {
                newArr[ind++] = arr1[i];
            }

            if (i < arr2.length) {
                newArr[ind++] = arr2[i];
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}