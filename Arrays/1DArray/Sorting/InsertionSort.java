import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = { 6, 5, 7, 4, 8, 3, 9, 2, 0, 1 };
        System.out.println("Before : " + Arrays.toString(arr));
        // insertion(arr, arr.length);
        
        insertionRec(arr, 1,arr.length);
        System.out.println("After : " + Arrays.toString(arr));
    }

    public static int sum(int val) {
        val = val + 1;
        return val;
    }

    public static void insertion(int[] arr, int n) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionRec(int[] arr, int i, int n) {

        if(i == arr.length)
    }
}