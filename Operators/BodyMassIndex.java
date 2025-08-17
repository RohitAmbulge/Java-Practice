import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in pounds : ");
        double weight = sc.nextDouble();

        System.out.println("Enter height in meters : ");
        double height = sc.nextDouble();

        double weightInKg = weight * 0.45359237;

        double heightInMeters = height * 0.0254;

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("BMI is: " + bmi);
    }
}
