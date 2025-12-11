import java.util.Arrays;

public class Decl1 {

    public static void main(String[] args) {
        char[][] arr = new char[2][];

        arr[0] = new char[2];
        arr[1] = new char[3];

        System.out.println(Arrays.deepToString(arr));
        arr[0][0] = 3;
        arr[0][1] = 4;

        arr[1][0] = 6;
        arr[1][1] = 9;
        arr[1][2] = 20;

        System.out.println(Arrays.deepToString(arr));
    }
}