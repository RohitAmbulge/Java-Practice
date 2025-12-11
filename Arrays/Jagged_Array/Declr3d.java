import java.util.Arrays;

public class Declr3d {

    public static void main(String[] args) {

        int[][][] arr = new int[2][1][2];
        arr[0][0][0] = 10;
        arr[0][0][1] = 20;
        arr[1][0][0] = 30;
        arr[1][0][1] = 40;

        System.out.println(Arrays.deepToString(arr));
    }
}