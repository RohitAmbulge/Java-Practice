package Matrix;

import java.util.Arrays;

public class ArrayDeclrFor2D {

    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 4;
        arr[0][1] = 5;
        arr[0][2] = 6;
        arr[1][0] = 9;
        arr[1][1] = 30;
        arr[1][2] = 40;
        System.out.println(Arrays.deepToString(arr));
    }
}