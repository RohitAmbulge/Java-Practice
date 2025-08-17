import java.util.Scanner;

public class IsUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);

        String output = (ch >= 65 && ch <= 90) ? ("character is in uppercase") : ("character is in lowercase");

        System.out.println(output);

    }
}
