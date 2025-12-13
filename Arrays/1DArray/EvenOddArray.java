import java.util.Arrays;

public class EvenOddArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int[] evenArray = new int[even];
        int[] oddArray = new int[odd];
        int eind = 0;
        int oind = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[eind++] = arr[i];
            } else {
                oddArray[oind++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));
    }
}