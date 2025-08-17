import java.util.Scanner;

public class FindPower {

    private static int power(int num, int pow) {
        int result = 1;

        for (int i = 1; i <= pow; i++) {
            result *= num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base number : ");
        int num = sc.nextInt();

        System.out.println("Enter the power : ");
        int pow = sc.nextInt();

        System.out.println("Result is : " + power(num, pow));
    }
}