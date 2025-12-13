import java.util.Arrays;
import java.util.Scanner;

public class RotationArrayClockwise {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Before : " + Arrays.toString(arr));

        System.out.println("Enter the rotaion : ");
        int rotation = new Scanner(System.in).nextInt();

        for (int i = 0; i < rotation; i++) {
            int temp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }

            arr[arr.length - 1] = temp;
        }

        System.out.println("After : " + Arrays.toString(arr));
    }
}