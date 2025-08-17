import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);

        String op = "";

        op = (operator == '+') ? (op += num1 + num2) :

                ((operator == '-') ? (op += num1 - num2) :

                        (((operator == '*') ? (op += num1 * num2) :

                                ((operator == '/') ? (op += num1 / num2) :

                                        ((operator == '%') ? (op += num1 % num2) :

                                                ("Invalid"))))));

        if (op.equals("Invalid")) {
            System.out.println("You have entered the incorrect operator!");
            return;
        }

        System.out.println(op);

    }

}
