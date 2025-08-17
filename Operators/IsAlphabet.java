import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        boolean output = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

        System.out.println(output);
    }
}
