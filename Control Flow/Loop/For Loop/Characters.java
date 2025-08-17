
public class Characters {
    public static void main(String[] args) {

        // A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // a to z
        for (char ch = 97; ch <= 122; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // 0 to 9
        for (char ch = 48; ch <= 57; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.err.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // 100 to 1
        for (int i = 100; i >= 1; i--) {
            System.err.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // 0 ot 127 all ascii characters
        for (char ch = 0; ch <= 127; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // A-Z a-z 0-9

        for (char ch = 0; ch <= 127; ch++) {

            if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                System.err.print(ch + " ");
            }
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // only special characters
        for (char ch = 0; ch <= 127; ch++) {

            if (!((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) {
                System.err.print(ch + " ");
            }
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // Z to A
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.err.print(ch + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.err.print(ch + ":" + (ch * 1) + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // a to z
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.err.print(ch + ":" + (ch * 1) + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // A C F J O U
        int num = 1;
        for (char ch = 'A'; ch <= 'Z'; ch += num) {
            System.err.print(ch + " ");
            num++;
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // A C E G I K

        for (char ch = 'A'; ch <= 'Z'; ch += 2) {
            System.err.print(ch + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        // Vowels from upper and lower case
        // for (char ch = 65; ch <= 122; ch++) {

        // switch (ch) {
        // case 'a', 'e', 'i', 'o', 'u' -> {
        // System.out.print(ch + " ");
        // }
        // case 'A', 'E', 'I', 'O', 'U' -> {
        // System.out.print(ch + " ");
        // }
        // }
        // }

        for (char ch = 65; ch <= 122; ch++) {
            String op = switch (ch) {
                case 'A', 'E', 'I', 'O', 'U' -> ch + "";
                case 'a', 'e', 'i', 'o', 'u' -> ch + "";
                default -> " ";

            };
        }
        System.out.println();

    }
}
