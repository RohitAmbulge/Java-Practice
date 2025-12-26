import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
        int key = 8;
        int pos = exponentialSearchUsingIterative(arr, arr.length - 1, key);
        System.out.println(pos);

        // int pos2 = exponentialSearchUsingRec(arr, key, 1);
        // System.out.println(pos2);
    }

    public static int exponentialSearchUsingIterative(int[] arr, int n, int key) {
        if (arr[0] == key)
            return 0;

        int i = 1;
        while (i <= n && key > arr[i]) {
            i *= 2;
        }

        return binarySearch(arr, key, i / 2, Math.min(n, i));
    }

    public static int binarySearch(int[] arr, int key, int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            low++;
            high--;
        }

        return -1;
    }

    public static int exponentialSearchUsingRec(int[] arr, int key, int ind) {

        if (arr[0] == key)
            return 0;

        if (ind < arr.length && key > arr[ind]) {
            return exponentialSearchUsingRec(arr, key, ind * 2);
        }

        return binarySearch(arr, key, ind / 2, Math.min(ind, arr.length - 1));

    }
}