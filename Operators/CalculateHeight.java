import java.util.Scanner;

public class CalculateHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value in feet : ");
        double height = sc.nextDouble();

        double heightInMeters = height * 0.305;

        System.out.println(height + " feel is " + heightInMeters);

    }
}
