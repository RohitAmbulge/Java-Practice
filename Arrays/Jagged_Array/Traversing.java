public class Traversing {

    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80 } };

        // Using for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Using while loop
        int k = 0;
        while (k < arr.length) {
            int l = 0;
            while (l < arr[k].length) {
                System.out.print(arr[k][l] + " ");
                l++;
            }
            k++;
            System.out.println();
        }

        System.out.println();

        // Using do while
        int m = 0;
        do {
            int n = 0;
            do {
                System.out.print(arr[m][n] + " ");
                n++;
            } while (n < arr[m].length);
            m++;
            System.out.println();
        } while (m < arr.length);

        // Using for each
        for (int[] sub : arr) {
            for (int ele : sub) {
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}