import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter the array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max Ele" + max);
        System.out.println("Min Ele" + min);
    }
}