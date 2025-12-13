public class Traverse {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

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
        int a = 0;
        do {
            int b = 0;
            do {
                System.out.print(arr[a][b] + " ");
                b++;
            } while (b < arr[a].length);
            a++;
            System.out.println();
        } while (a < arr.length);

        System.out.println();
        // Using for each loop
        for (int[] ele : arr) {
            for (int val : ele) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}