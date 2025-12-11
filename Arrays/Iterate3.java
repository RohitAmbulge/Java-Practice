public class Iterate3 {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 8 };

        System.out.println("Using for : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Using while");
        int j = 0;
        while (j < arr.length) {
            System.out.print(arr[j++] + " ");
        }

        System.out.println();
        System.out.println("Using do while");
        int k = 0;
        do { // 2
            System.out.print(arr[k] + " ");
            k++;// 1
        } while (k < arr.length);
    }
}