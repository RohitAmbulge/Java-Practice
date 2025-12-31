import java.util.Arrays;

public class SentinalSearching {

    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int key = 20;
        System.out.println(Arrays.toString(arr));
        int pos1 = sentinalSearch(arr, arr.length, key);
        System.out.println(pos1);
        int pos2 = sentinalRecursion(arr, key, 0, arr.length);
        System.out.println(pos2);
    }

    public static int sentinalSearch(int[] arr, int n, int key) {
        int last = arr[n - 1];
        arr[n - 1] = key;

        int i = 0;

        while (arr[i] != key)
            i++;

        // arr[n - 1] = last;

        if (i < n - 1 || last == key)
            return i;

        return -1;
    }

    public static int sentinalRecursion(int[] arr, int key, int ind, int n) {

        int last = arr[n - 1];
        arr[n - 1] = key;

        if (arr[ind] != key) {
            return sentinalRecursion(arr, key, ind + 1, n);
        }

        if (ind < n - 1 || last == key) {
            return ind;
        } else {
            return -1;
        }

    }
}