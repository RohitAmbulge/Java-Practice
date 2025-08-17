import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first element : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second element : ");
        int num2 = sc.nextInt();

        String result = (num1 > num2) ? ("Larget number is : " + num1) : ("Larget number is : " + num2);

        System.out.println(result);
    }

}
