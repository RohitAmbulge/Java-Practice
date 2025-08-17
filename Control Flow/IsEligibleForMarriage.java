import java.util.Scanner;

public class IsEligibleForMarriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        System.out.println("Enter the Prorperty : ");
        long property = sc.nextLong();

        System.out.println("Enter your sirname : ");
        String sirname = sc.next().toUpperCase();

        if (age > 21) {
            if (property > 10000000 || sirname.equals("AMBANI")) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage");
            }
        } else {
            System.out.println("Not eligible for marriage");
        }
    }
}
