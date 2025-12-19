import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 2, 3, 5, 0, 1, 9, 0, 3 };

        int[] res = remove(arr);

        System.out.println(Arrays.toString(res));
    }

    public static int[] remove(int[] arr) {
        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            if (count[i] != -1) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        cnt++;
                        count[j] = -1;
                    }
                }
                count[i] = cnt;
            }

        }

        int noOfUniq = 0;

        for (int val : count) {
            if (val != -1) {
                noOfUniq++;
            }
        }

        int[] res = new int[noOfUniq];

        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count[i] != -1) {
                res[ind++] = arr[i];
            }
        }

        return res;

    }
}