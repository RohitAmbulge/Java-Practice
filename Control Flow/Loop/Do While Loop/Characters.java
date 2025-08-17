
public class Characters {
    public static void main(String[] args) {
        // Number from 1 to 100
        int i = 1;
        do {
            System.out.print(i++ + " ");
        } while (i <= 100);

        System.out.println();
        System.out.println("------------");

        // Number from 100 to 1
        i = 100;
        do {
            System.out.print(i-- + " ");
        } while (i >= 1);

        System.out.println();
        System.out.println("------------");

        // Even Numbers
        int j = 2;
        do {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= 100);

        System.out.println();
        System.out.println("------------");

        // Odd Numbers
        j = 1;
        do {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        } while (j <= 100);

        System.out.println();
        System.out.println("------------");

        // From A to Z
        char ch = 65;
        do {
            System.out.print(ch++ + " ");
        } while (ch <= 90);

        System.out.println();
        System.out.println("------------");

        // From a to z
        ch = 97;
        do {
            System.out.print(ch++ + " ");
        } while (ch <= 122);

        System.out.println();
        System.out.println("------------");

        // From 0 to 9
        ch = 48;
        do {
            System.out.print(ch++ + " ");
        } while (ch <= 57);

        System.out.println();
        System.out.println("------------");

        // From 0 to 122
        ch = 48;
        do {
            if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                System.out.print(ch + " ");
            }

            ch++;
        } while (ch <= 122);

        System.out.println();
        System.out.println("------------");

        // Only Special Character
        ch = 0;
        do {
            if (!((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) {
                System.err.print(ch + " ");
            }
            ch++;
        } while (ch <= 127);

        System.out.println();
        System.out.println("------------");

        // From z to a
        ch = 'z';
        do {
            System.out.print(ch + " ");
            ch--;
        } while (ch >= 'a');

        System.out.println();
        System.out.println("------------");

        // ASCII char with values from A to Z
        ch = 'A';
        do {
            System.out.print(ch + ":" + (ch + 0) + " ");
            ch++;
        } while (ch <= 'Z');

        System.out.println();
        System.out.println("------------");

        // ASCII char with values from a to z
        ch = 'a';
        do {
            System.out.print(ch + ":" + (ch + 0) + " ");
            ch++;
        } while (ch <= 'z');

        System.out.println();
        System.out.println("------------");

        // Alternative char with values from A to Z
        ch = 'A';
        do {
            System.out.print(ch + ":" + (ch + 0) + " ");
            ch += 2;
        } while (ch <= 'Z');

        System.out.println();
        System.out.println("------------");

        int num = 1;
        ch = 'A';
        do {
            System.err.print(ch + " ");
            num++;
            ch += num;
        } while (ch <= 'Z');

        System.out.println();
        System.out.println("------------");

        ch = '0';

        do {
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
        } while (ch <= 127);
    }

}
