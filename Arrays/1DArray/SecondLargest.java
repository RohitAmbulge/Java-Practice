import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max = SecondLargest(arr);
        System.out.println("Second Max : " + max);

        int min = secondSmallest(arr);
        System.out.println("Second Min : " + min);
    }

    public static int SecondLargest(int[] arr) {
        int max = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (max != arr[i]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static int secondSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != min) {
                return arr[i];
            }
        }

        return -1;
    }
}