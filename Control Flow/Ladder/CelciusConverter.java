import java.util.Scanner;

public class CelciusConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println();
            System.out.println();
            System.out.println("****************Welcome****************");
            System.out.println("         Temperature Converter           ");
            System.out.println();
            System.out.println("Convert temperature from celcius to : ");
            System.out.println("1. Kelvin");
            System.out.println("2. Fahrenhiet");
            System.out.println("3. Rankine");
            System.out.println();
            System.out.println("For EXIT Enter : 0");
            System.out.println();

            System.out.print("In which unit you want to convert : ");
            int userResp = sc.nextInt();

            if (userResp == 0) {
                System.out.println();
                System.out.println("      Thank You ! Visit Again.......");
                return;
            }

            System.out.print("Enter the temperature in celcius : ");
            float temperature = sc.nextFloat();

            String response = "";
            float convertedTemp = 0;

            if (userResp == 1) {
                response = "Kelvin";
                convertedTemp = temperature + 273.15f;
            } else if (userResp == 2) {
                response = "Fahrenhiet";
                convertedTemp = (temperature * 9) / 5 + 32;
            } else if (userResp == 3) {
                response = "Rankine";
                convertedTemp = (temperature * 9) / 5 + 491.67f;
            } else {
                System.out.println("INVALID TESPONSE");
                continue;
            }

            System.out.println(temperature + " celcius is equal to : " + convertedTemp + " " + response);

        }

    }
}
