public class Iterate {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int len = 0;
        for (int i = 0;; i++) {
            try {

                int a = arr[i];
                len++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }

        System.out.println(len);
    }
}