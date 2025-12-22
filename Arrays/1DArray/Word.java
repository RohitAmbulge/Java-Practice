import java.util.Arrays;

public class Word {

    public static void main(String[] args) {
        String str = "Hello";
        char[] ch = str.toCharArray();

        frequency(ch);
        System.out.println("*********************");

        duplicate(ch);
        System.out.println("*********************");

        distinct(ch);
        System.out.println("*********************");

        unique(ch);
        System.out.println("*********************");

        System.out.println("Min repeating el : " + minRepeatingEle(ch));
        System.out.println("*********************");

        System.out.println("Max repeating ele : " + maxRepeatingEle(ch));
        System.out.println(Arrays.toString(ch));
    }

    public static void frequency(char[] ch) {

        boolean[] trace = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {

            if (trace[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    trace[j] = true;
                }
            }

            System.out.println(ch[i] + " : " + count);
        }
    }

    public static void duplicate(char[] ch) {

        boolean[] trace = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {

            if (trace[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    trace[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(ch[i] + " : " + count);
            }
        }
    }

    public static void distinct(char[] ch) {
        boolean[] trace = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (trace[i] == true)
                continue;

            // int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    // count++;
                    trace[j] = true;
                }
            }

            System.out.println(ch[i]);
        }
    }

    public static void unique(char[] ch) {
        boolean[] trace = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (trace[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    trace[j] = true;
                }

            }

            if (count == 1) {
                System.out.println(ch[i]);
            }
        }

    }

    public static char maxRepeatingEle(char[] ch) {

        int max = Integer.MIN_VALUE;
        char ele = 0;
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ele = ch[i];
            }
        }

        return ele;
    }

    public static char minRepeatingEle(char[] ch) {
        int min = Integer.MAX_VALUE;
        char minEle = 0;
        for (int i = 0; i < ch.length; i++) {

            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j])
                    count++;
            }

            if (count < min) {
                min = count;
                minEle = ch[i];
            }
        }

        return minEle;
    }
}