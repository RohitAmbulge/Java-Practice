import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();

        int ind = searchUsingRecursion(arr, 0, 21);
        System.out.println("Element found at index : " + ind);

    }

    public static int searchUsingIterative(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }

        return -1;
    }

    public static int searchUsingRecursion(int[] arr, int ind, int key) {
        if (ind == arr.length)
            return -1;
        if (arr[ind] == key)
            return ind;

        return searchUsingRecursion(arr, ind + 1, key);
    }
}