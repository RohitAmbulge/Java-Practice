import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 3, 4, 6, 7, 1, 2 };

        System.out.println("Main Before : " + Arrays.toString(arr));
        // selectionSort(arr);
        selectionSortRec(arr, 0, arr.length);
        System.out.println("Main After : " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        // { 1, 6, 7, 8, 3, 4, 6, 7, 5, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;// 0
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] >= arr[j]) {
                    min = j;// 8
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    public static void innerIteration(int[] arr, int j, int i, int min) {

        if (j == arr.length) {
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            return;
        }

        if (arr[min] > arr[j]) {
            innerIteration(arr, j + 1, i, j);
        }

    }

    public static void selectionSortRec(int[] arr, int i, int n) {

        if (i == arr.length - 1)
            return;

        // int min = i;// 0
        innerIteration(arr, i + 1, i, i);
        selectionSortRec(arr, i + 1, n);
    }
}