import java.util.Scanner;

public class PrimeNumber {
    // static int num;
    // static int dup;
    // static boolean result;

    // static {
    // System.out.println("Enter the number : ");
    // num = new Scanner(System.in).nextInt();
    // dup = num;

    // }

    // public static void isPrime() {
    // --num;

    // if (num == 2) {
    // result = true;
    // return;
    // }

    // if (dup % num == 0) {
    // return;
    // }

    // isPrime();

    // }

    public static boolean isPrime2(int num, int start) {
        if (num < 2)
            return false;

        if (start >= (num / 2) + 1)
            return true;

        if (num % start == 0)
            return false;
        return isPrime2(num, ++start);
    }

    public static void main(String[] args) {
        // isPrime();
        // System.out.println("The number " + dup + " is Prime : " + result);

        Scanner sc = new Scanner(System.in);

        if (isPrime2(sc.nextInt(), 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime Number");
        }

    }
}