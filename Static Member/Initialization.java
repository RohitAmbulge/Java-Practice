import java.util.*;

public class Initialization {

    static Scanner sc = new Scanner(System.in);
    static int addition = sc.nextInt() + sc.nextInt();
    static int addition2;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        addition2 = num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("Actual Execution Starts ");
        System.out.println("Addition1 : " + addition);
        System.out.println("Addition2 : " + addition2);
    }
}