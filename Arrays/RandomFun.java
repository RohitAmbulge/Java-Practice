import java.util.Arrays;
import java.util.Scanner;

public class RandomFun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int randomVal = (int) (Math.random() * 100);
            if (randomVal < 10) {
                i--;
                continue;
            }
            arr[i] = randomVal;

        }

        System.out.println("Before : " + Arrays.toString(arr));

        // System.out.println(Math.random());
    }
}