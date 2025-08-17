import java.util.Scanner;

public class IsLeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        String output = (year % 100 == 0) ? ((year % 400 == 0) ? ("Leap year") : ("Not Leap year"))
                : ((year % 4 == 0) ? ("Leap Year") : ("Not a leap year"));

        System.out.println(output);
    }

}
