import java.util.Scanner;

public class StaticApplication {

    static String mypin = System.getenv("mypin");

    static {
        Scanner sc = new Scanner(System.in);
        boolean assump = false;

        for (int i = 3; i >= 1; i--) {
            System.out.println("Enter your pin");
            String pin = sc.next();

            if (pin.equals(mypin)) {
                assump = true;
                break;
            } else {
                System.out.println("Invalid Pin");
                System.out.println("Attempt left : " + (i - 1));
            }
        }

        if (!assump) {
            System.exit(0);
        }
    }

    public static void launchApplication() {
        System.out.println();
        System.out.println("PhonePay /n Home page");
    }

    public static void main(String[] args) {
        launchApplication();

    }
}