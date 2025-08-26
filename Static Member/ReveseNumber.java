import java.util.Scanner;

public class ReveseNumber {

    static {
        System.out.println("Enter the number : ");
        int rev = reverse(new Scanner(System.in).nextInt());

        System.out.println(rev);
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        return rev;

    }

}