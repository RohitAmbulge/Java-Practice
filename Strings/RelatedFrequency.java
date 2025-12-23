public class RelatedFrequency {

    public static void main(String[] args) {
        String str = "hey i am rohit ambulge i am from nanded rohit graduated student";

        String[] str2 = str.split(" ");

        frequency(str2);
        System.out.println("*********************");

        duplicate(str2);
        System.out.println("*********************");

        distinct(str2);
        System.out.println("*********************");

        unique(str2);
        System.out.println("*********************");

        System.out.println("Min repeating el : " + minRepeatingEle(str2));
        System.out.println("*********************");

        System.out.println("Max repeating ele : " + maxRepeatingEle(str2));

    }

    public static void frequency(String[] str) {

        boolean[] trace = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {

            if (trace[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                    trace[j] = true;
                }
            }

            System.out.println(str[i] + " : " + count);
        }
    }

    public static void duplicate(String[] str) {

        boolean[] trace = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {

            if (trace[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                    trace[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(str[i] + " : " + count);
            }
        }
    }

    public static void distinct(String[] str) {
        boolean[] trace = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {
            if (trace[i] == true)
                continue;

            // int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    // count++;
                    trace[j] = true;
                }
            }

            System.out.println(str[i]);
        }
    }

    public static void unique(String[] str) {
        boolean[] trace = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {
            if (trace[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                    trace[j] = true;
                }

            }

            if (count == 1) {
                System.out.println(str[i]);
            }
        }

    }

    public static String maxRepeatingEle(String[] str) {

        int max = Integer.MIN_VALUE;
        String ele = "";
        for (int i = 0; i < str.length; i++) {
            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ele = str[i];
            }
        }

        return ele;
    }

    public static String minRepeatingEle(String[] str) {
        int min = Integer.MAX_VALUE;
        String minEle = "";
        for (int i = 0; i < str.length; i++) {

            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]))
                    count++;
            }

            if (count < min) {
                min = count;
                minEle = str[i];
            }
        }

        return minEle;
    }
}