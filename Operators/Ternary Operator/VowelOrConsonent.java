import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character : ");
        char ch = sc.next().toLowerCase().charAt(0);

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? ("The character is vowel")
                : ("The character is consonent");
        System.out.println(result);
    }

}
