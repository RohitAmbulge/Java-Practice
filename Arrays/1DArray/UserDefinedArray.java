import java.util.Arrays;
import java.util.Scanner;

public class UserDefinedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter thhe size of an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " Element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}