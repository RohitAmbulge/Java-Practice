import java.util.Scanner;

public class Example {

    static int num;

    public static boolean checkNumber() {
        if (num <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt(); // num > 0 ---> valid

        // If number is valid then block gets execute

        if (checkNumber()) {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}