import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return (count == 2);
    }

    public static boolean isPrimeOpti(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if (isPrimeOpti(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }

    }
}