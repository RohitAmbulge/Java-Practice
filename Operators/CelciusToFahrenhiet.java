import java.util.Scanner;

public class CelciusToFahrenhiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the degree in Celcius: ");
        double celcius = sc.nextDouble();

        double fahrenhiet = (1.8) * celcius + 32;

        System.out.println(fahrenhiet);

    }
}