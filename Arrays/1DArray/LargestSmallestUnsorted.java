public class LargestSmallestUnsorted {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 8, 4, 9, 5, 6, 5 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("First Small : " + min);
        System.out.println("First Large : " + max);
        System.out.println("Second Large : " + SecondLargest(arr));
        System.out.println("Second Small : " + SecondSmallest(arr));
    }

    public static int SecondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        }

        return max2;
    }

    public static int SecondSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            }
        }

        return min2;
    }

}