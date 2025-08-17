
public class Example {
    public static void main(String[] args) {

        // Number from 1 to 100
        int i = 1;
        while (i <= 100) {
            System.out.print(i++ + " ");
        }

        System.out.println();
        System.out.println("------------");

        // Number from 100 to 1
        i = 100;
        while (i >= 1) {
            System.out.print(i-- + " ");
        }

        System.out.println();
        System.out.println("------------");

        // Even Numbers
        int j = 1;
        while (j <= 100) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }

        System.out.println();
        System.out.println("------------");

        // Odd Numbers
        j = 1;
        while (j <= 100) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }

        System.out.println();
        System.out.println("------------");

        // From A to Z
        char ch = 65;
        while (ch <= 90) {
            System.out.print(ch++ + " ");
        }

        System.out.println();
        System.out.println("------------");

        // From a to z
        ch = 97;
        while (ch <= 122) {
            System.out.print(ch++ + " ");
        }

        System.out.println();
        System.out.println("------------");

        // From 0 to 9
        ch = 48;
        while (ch <= 57) {
            System.out.print(ch++ + " ");
        }

        System.out.println();
        System.out.println("------------");

        // From 0 to 122
        ch = 48;
        while (ch <= 122) {
            if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                System.out.print(ch + " ");
            }

            ch++;
        }

        System.out.println();
        System.out.println("------------");

        // Only Special Character
        ch = 0;
        while (ch <= 127) {
            if (!((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) {
                System.err.print(ch + " ");
            }
            ch++;
        }

        System.out.println();
        System.out.println("------------");

        // From z to a
        ch = 'z';
        while (ch >= 'a') {
            System.out.print(ch + " ");
            ch--;
        }

        System.out.println();
        System.out.println("------------");

        // ASCII char with values from A to Z
        ch = 'A';
        while (ch <= 'Z') {
            System.out.print(ch + ":" + (ch + 0) + " ");
            ch++;
        }

        System.out.println();
        System.out.println("------------");

        // ASCII char with values from a to z
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + ":" + (ch + 0) + " ");
            ch++;
        }

        System.out.println();
        System.out.println("------------");

        // Alternative char with values from A to Z
        ch = 'A';
        while (ch <= 'Z') {
            System.out.print(ch + ":" + (ch + 0) + " ");
            ch += 2;
        }

        System.out.println();
        System.out.println("------------");

        int num = 1;
        ch = 'A';
        while (ch <= 'Z') {
            System.err.print(ch + " ");
            num++;
            ch += num;
        }

        System.out.println();
        System.out.println("------------");

        ch = '0';

        while (ch <= 127) {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> {
                    System.out.println(ch + " is vowel");
                }
                case 'A', 'E', 'I', 'O', 'U' -> {
                    System.out.println(ch + " is vowel");
                }
                default -> {
                    System.out.println(ch + " is Consonant");
                }

            }
            ;

            ch++;
        }
    }
}
