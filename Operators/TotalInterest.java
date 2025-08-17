import java.util.Scanner;

public class TotalInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the balance");
        float balance = sc.nextFloat();

        System.out.println("Enter the interest rate: ");
        float annualInterestRates = sc.nextFloat();

        float interest = balance * (annualInterestRates / 1200);

        System.out.println("The interest is : " + interest);
    }

}
