import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {

        System.out.println("Enter the character : ");
        char ch = new Scanner(System.in).next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }
    }
}
