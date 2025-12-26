import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Ele found at : " + usingIterativeApproach(arr, 15));
        System.out.println("Rec : " + usingRecursiveApp(arr, 0, arr.length - 1, 7));
    }

    public static int usingIterativeApproach(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }

    public static int usingRecursiveApp(int[] arr, int min, int max, int key) {
        int mid = (min + max) / 2;

        if (min > max)
            return -1;
        if (arr[mid] == key)
            return mid;
        else if (key > arr[mid]) {
            return usingRecursiveApp(arr, mid + 1, max, key);
        } else {
            return usingRecursiveApp(arr, min, mid - 1, key);
        }

    }
}