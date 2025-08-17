import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the subtotal and gratuity : ");
        float subTotal = sc.nextFloat();
        float gratuity = sc.nextFloat();

        float totalGratuity = subTotal * (gratuity / 100);

        float total = totalGratuity + subTotal;

        System.out.println("The tip is " + totalGratuity + " and total is " + total);

    }

}
