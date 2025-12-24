import java.util.Arrays;

public class SentinalSearching {

    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int key = 5;
        System.out.println(Arrays.toString(arr));
        int pos = sentinalSearch(arr, arr.length, key);
        System.out.println(pos);
    }

    public static int sentinalSearch(int[] arr, int n, int key) {
        int last = arr[n - 1];
        arr[n - 1] = key;

        int i = 0;

        while (arr[i] != key)
            i++;

        arr[n - 1] = last;

        if (i < n - 1 && arr[i] == key)
            return i;
        else
            return -1;
    }

    // public static int sentinalRecursion(int[] arr, int n, int ind, int key) {

    // int last = arr[n - 1];
    // arr[n - 1] = key;

    // if (arr[ind] == key || ind == n) {
    // arr[n - 1] = last;
    // }

    // }
}