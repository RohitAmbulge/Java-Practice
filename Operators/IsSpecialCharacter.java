import java.util.Scanner;

public class IsSpecialCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character : ");

        char ch = sc.next().charAt(0);

        boolean output = (ch >= 'A' && ch <= 'Z') || (ch >= 'A' && ch <= 'Z') || (ch >= 48 && ch <= 58);

        boolean result = !output;

        System.out.println(result);
    }

}
