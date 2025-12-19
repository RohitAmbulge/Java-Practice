import java.util.Arrays;

public class UnionIntersection {

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 50 };
        int[] arr2 = { 40, 10, 100, 90 };

        int[] res = union(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] union(int[] arr1, int[] arr2) {
        int count = countOfCommon(arr1, arr2);
        int[] ans = new int[(arr1.length + arr2.length) - count];

        int i = 0;
        for (i = 0; i < arr1.length; i++) {
            ans[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; i++) {
            if (!contains(arr1, arr2[j])) {
                ans[i] = arr2[j];
                i++;
            }
        }

        return ans;
    }

    public static int countOfCommon(int[] arr1, int[] arr2) {
        int common = 0;

        if (arr1.length < arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (contains(arr2, arr1[i])) {
                    common++;
                }
            }
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (contains(arr1, arr2[i])) {
                    common++;
                }
            }
        }

        return common;
    }

    public static boolean contains(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return true;
            }
        }

        return false;
    }
}