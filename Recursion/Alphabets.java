
public class Alphabets {
    static char ch = 'z';

    public static void printAlphabets() {
        System.out.print(ch + " ");
        if (ch-- == 'a')
            return;

        printAlphabets();
    }

    public static void main(String[] args) {
        printAlphabets();

    }
}