import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        if (number < 1 || number > 12) {
            System.out.println("Invalid Input");
            return;
        }

        String month = switch (number) {
            case 1 -> "JAN";
            case 2 -> "FEB";
            case 3 -> "MAR";
            case 4 -> "APR";
            case 5 -> "MAY";
            case 6 -> "JUN";
            case 7 -> "JUL";
            case 8 -> "AUG";
            case 9 -> "SEP";
            case 10 -> "OCT";
            case 11 -> "NOV";
            case 12 -> "DEC";
            default -> "INVALID";
        };

        System.out.println(month);
    }
}
