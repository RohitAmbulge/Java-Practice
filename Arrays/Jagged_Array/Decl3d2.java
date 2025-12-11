import java.util.Arrays;

public class Decl3d2 {

    public static void main(String[] args) {
        int[][][] arr = new int[2][][];

        arr[0] = new int[2][3];
        arr[1] = new int[1][5];

        arr[0][0][0] = 2;
        arr[0][0][1] = 3;
        arr[0][1][0] = 4;
        arr[0][1][1] = 7;
        System.out.println(Arrays.deepToString(arr));
    }
}