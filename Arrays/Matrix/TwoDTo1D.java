import java.util.Arrays;

public class TwoDTo1D {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 } };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
            }
        }

        int[] result = new int[count];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[ind++] = arr[i][j];
            }
        }

        System.out.println(Arrays.toString(result));

    }
}