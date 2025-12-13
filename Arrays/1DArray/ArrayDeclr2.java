import java.util.Arrays;

public class ArrayDeclr2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        // int[] arr2 = { 3, 4, 5, 6 };
        arr[0] = 3;
        
        arr[2] = 5;
        arr[4] = 7;

        System.out.println(Arrays.toString(arr));
    }
}