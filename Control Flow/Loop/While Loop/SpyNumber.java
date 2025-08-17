import java.util.Scanner;

class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        int temp = num;

        int sum = 0;
        int mul = 1;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            mul *= digit;
            num /= 10;
        }

        if (sum == mul) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}