import java.util.Scanner;

public class CheckPalindrome {

    public static boolean palindromeNumber(int num) {
        int temp = num;
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        return (temp == rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (palindromeNumber(num)) {
            System.out.println(num + " is palindrome");
        } else {
            System.out.println(num + " is not palindrome");

        }
    }
}