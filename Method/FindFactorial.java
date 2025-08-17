import java.util.Scanner;

public class FindFactorial {

    private static int findFact(int num) {
        int fact = 1;

        while (num != 0) {
            fact *= num;
            num--;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println(findFact(num));

    }
}