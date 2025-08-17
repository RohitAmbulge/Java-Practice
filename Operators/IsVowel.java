public class IsVowel {
    public static void main(String[] args) {
        System.out.println("Enter the character : ");
        char ch = new java.util.Scanner(System.in).next().toLowerCase().charAt(0);

        boolean output = (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u');

        System.out.println(output);
    }

}
