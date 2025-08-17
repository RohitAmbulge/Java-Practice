
public class LabelExample {
    public static void main(String[] args) {

        System.out.println("Main Method execution starts");

        // Label
        evenOdd: {

            System.out.println("even odd block execution starts");

            if (5 % 2 == 0) {
                System.out.println("Even");
                break evenOdd;
            } else {
                System.out.println("Odd");
            }

            System.out.println("even odd block execution ends");

        }
        System.out.println("Main Method execution ends");
    }

}
