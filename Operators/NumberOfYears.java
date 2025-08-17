import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        long minutes = sc.nextLong();

        long totalDays = minutes / (60 * 24);

        long days = totalDays % 365;
        long years = totalDays / 365;

        System.out.println(minutes + " minute in approximattely " + years + " years and " + days + " days");

    }

}
