import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the character : ");
        char ch = sc.next().toUpperCase().charAt(0);

        String output = switch (ch) {
            case 'A' -> ch + " is a vowel";
            case 'E' -> ch + " is a vowel";
            case 'I' -> ch + " is a vowel";
            case 'O' -> ch + " is a vowel";
            case 'U' -> ch + " is a vowel";
            default -> ch + " is Invalid Character";
        };

        System.out.println(output);
    }

}
