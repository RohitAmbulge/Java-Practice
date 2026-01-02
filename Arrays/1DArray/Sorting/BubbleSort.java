import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 3, 4, 6, 7, 1, 2 };
        String[] str = { "Rohit", "Ramesh", "Rutik" };

        System.out.println("Main Before : " + Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        sortString(str, str.length);
        System.out.println(Arrays.toString(str));
        System.out.println("Main After : " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sortString(String[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i].compareTo(arr[j])) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}