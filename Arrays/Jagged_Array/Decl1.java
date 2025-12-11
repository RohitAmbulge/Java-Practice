import java.util.Arrays;

public class Decl1 {

    public static void main(String[] args) {
        char[][] arr = new char[2][];

        arr[0] = new char[2];
        arr[1] = new char[3];

        System.out.println(Arrays.deepToString(arr));
        arr[0][0] = 'a';
        arr[0][1] = 'e';

        arr[1][0] = 't';
        arr[1][1] = 'y';
        arr[1][2] = 'h';

        System.out.println(Arrays.deepToString(arr));
    }
}