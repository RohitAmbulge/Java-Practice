
public class BackwardTraversing {

    public static void main(String[] args) {
        int[] arr = { 20, 40, 39, 27, 57 };

        System.out.println("Using for loop : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Using while loop : ");
        int j = arr.length - 1;
        while (j >= 0) {
            System.out.print(arr[j] + " ");
            j--;
        }

        System.out.println();
        System.out.println("using do while");
        int k = arr.length - 1;
        do {
            System.out.print(arr[k] + " ");
            k--;
        } while (k >= 0);
    }
}