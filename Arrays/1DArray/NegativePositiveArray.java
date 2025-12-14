import java.util.Arrays;

public class NegativePositiveArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, 5, -8, 7, 3, -9 };

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int nextNeg = -1;
            if (arr[i] > 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < 0) {
                        nextNeg = j;
                        break;
                    }
                }

                if (nextNeg == -1)
                    break;

                int temp = arr[nextNeg];
                for (int k = nextNeg - 1; k >= i; k--) {
                    arr[k + 1] = arr[k];
                }
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}