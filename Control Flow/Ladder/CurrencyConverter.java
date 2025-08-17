import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println();
            System.out.println("****************************Welcome****************************");
            System.out.println();
            System.out.println("List of Currencies : ");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. AUD");
            System.out.println("4. BZD");
            System.out.println("5. AMD");
            System.out.println("6. AFN");
            System.out.println("7. BHD");

            System.out.println();
            System.out.println("For Exit Enter 0");
            System.out.println();

            System.out.print("Enter the currency code : ");
            String code = sc.next().toUpperCase();

            if (code.equals("0")) {
                System.out.println();
                System.out.println("Thank You Visit Again");
                return;
            }

            System.out.print("Enter your amount : ");
            float inr = sc.nextFloat();

            boolean asump = true;
            float convertedAmount = 0;

            if (code.equals("USD")) {
                convertedAmount = inr / 85.5950f;
            } else if (code.equals("EUR")) {
                convertedAmount = inr / 100.427f;
            } else if (code.equals("AUD")) {
                convertedAmount = inr / 56.1216f;
            } else if (code.equals("BZD")) {
                convertedAmount = inr / 85.5950f;
            } else if (code.equals("AMD")) {
                convertedAmount = inr / 0.22276f;
            } else if (code.equals("AFN")) {
                convertedAmount = inr / 1.22600f;
            } else if (code.equals("BHD")) {
                convertedAmount = inr / 227.618f;
            } else {
                System.out.println();
                System.out.println("INVALID Currency Code i.e. : " + code);
                asump = false;
            }

            if (asump) {
                System.out.println(inr + "INR : " + convertedAmount + " " + code);
            }
        }
    }

}
