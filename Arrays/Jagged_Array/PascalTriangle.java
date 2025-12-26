import java.util.Arrays;

public class PascalTriangle {

    public static void main(String[] args) {

        int level = new java.util.Scanner(System.in).nextInt();

        // int [] arr = new int[level];
        int[][] arr = { { 1 }, { 1, 1 }, { 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

        System.out.println(Arrays.deepToString(arr));
        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}