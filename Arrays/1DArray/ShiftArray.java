import java.util.Arrays;

public class ShiftArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("Before : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int nextOdd = -1;
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 != 0) {
                        nextOdd = j;
                        break;
                    }

                }

                if (nextOdd == -1)
                    break;

                int temp = arr[nextOdd];
                for (int k = nextOdd - 1; k >= i; k--) {
                    arr[k + 1] = arr[k];
                }
                arr[i] = temp;
            }

        }

        System.out.println("After : " + Arrays.toString(arr));

    }

}