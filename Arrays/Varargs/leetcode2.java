public class leetcode2 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int val = 6;

        System.out.println(search(arr, val));
    }

    public static int search(int arr[], int val) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > val) {
                return i - 1;
            }
        }

        return arr.length;
    }
}