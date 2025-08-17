import java.util.Scanner;

public class IsEvenOrOdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        /*
         * int quotient = num / 2;
         * int pro = quotient * 2;
         * String output = (num == pro) ? (num + " is even") : (num + " is odd");
         */

        String output = ((num / 2) == (num / 2.0)) ? (num + " is even") : (num + " is odd");

        System.out.println(output);
    }

}
