import java.util.Scanner;

public class FactorsOfNumber {

    static int num;
    static {
        System.out.println("Enter the number");
        num = new Scanner(System.in).nextInt();
    }
    static int i = 1;

    public static void factorOf() {
        if (i > num)
            return;

        if (num % i == 0) {
            System.out.println(i);
        }
        i++;

        factorOf();
    }

    public static void main(String[] args) {
        System.out.println("Factors are : ");
        factorOf();
    }
}