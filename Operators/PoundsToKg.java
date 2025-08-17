import java.util.Scanner;

public class PoundsToKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float pound = 0.454f;

        System.out.println("Enter a number in poundes : ");
        float number = sc.nextFloat();

        float toKgs = number * pound;

        System.out.println(number + " pound is " + toKgs + " kilograms");

    }

}
