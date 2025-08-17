
public class Concepts {
    public static void main(String[] args) {
        /*
         * for (int i = 1; i <= 5; i++) ;
         * {
         * System.out.println(i);
         * }
         * 
         */

        /*
         * for (int i = 1; i <= 5; i++)
         * ;
         * {
         * System.out.println("Hello");
         * }
         * 
         */

        /*
         * for (int i = 1; i <= 5; i++)
         * 
         * System.out.println(i);
         * System.out.println("Hello");
         * 
         */

        /*
         * for (int i = 0, j = 0; i < 5 || j < 4; i++, j++) {
         * System.out.println(i);
         * System.out.println(j);
         * }
         */

        /*
         * int[] arr = { 1, 2, 3, 4 };
         * java.util.Scanner sc = new java.util.Scanner(System.in);
         * int j = sc.nextInt();
         * int i;
         * for (i = 5; i < j;) {
         * System.out.println(i++);
         * }
         * 
         */

        /*
         * System.out.println("starts");
         * for (byte i = 1;; i++) {
         * System.out.println(i);
         * }
         * System.out.println("ends");
         * 
         */

        boolean condt = false;
        System.out.println("starts");
        for (byte i = 1; condt;) {
            System.out.println(i++);
        }
        System.out.println("ends");

    }

}
