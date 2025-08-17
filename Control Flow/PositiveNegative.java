import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        int num = new Scanner(System.in).nextInt();

        if (num > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

    }

}
