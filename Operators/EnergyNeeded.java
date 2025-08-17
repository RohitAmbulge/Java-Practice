import java.util.Scanner;

public class EnergyNeeded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of water in kgs");
        float water = sc.nextFloat();

        System.out.println("Enter the initial temperature");
        float initialTemp = sc.nextFloat();

        System.out.println("Enter the final temperature");
        float finalTemp = sc.nextFloat();

        float totalEnergy = water * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is " + totalEnergy);

    }

}
