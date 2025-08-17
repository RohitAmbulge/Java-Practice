import java.util.Scanner;

public class SmallestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first element : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second element : ");
        int num2 = sc.nextInt();

        System.out.println("Enter third element : ");
        int num3 = sc.nextInt();

        String result = (num1 < num2)
                ? ((num1 < num3) ? ("Smallest number is : " + num1) : ("Smallest number is : " + num3))
                : ((num2 < num3) ? ("Smallest number is : " + num2) : ("Smallest number is : " + num3));

        System.out.println(result);
    }
}
