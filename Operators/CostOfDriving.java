import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the driving distance : ");
        float distance = sc.nextFloat();

        System.out.println("Enter miles per gallon : ");
        float fuelEfficiency = sc.nextFloat();

        System.out.println("Enter the price per gallon : ");
        float price = sc.nextFloat();

        float gallonRequired = distance / fuelEfficiency;

        float totalPrice = gallonRequired * price;

        System.out.println("The cost of driving : " + totalPrice);
    }
}
