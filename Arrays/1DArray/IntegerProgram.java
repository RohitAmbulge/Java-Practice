public class IntegerProgram {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 9, 5, 6, 3, 4, 3, 6, 8, 7 };

        frequency(arr);

        System.out.println("***************************");

        duplicate(arr);
        System.out.println("***************************");

        distinct(arr);
        System.out.println("***************************");

        unique(arr);
        System.out.println("***************************");

        System.out.println("Max repeating ele : " + maxRepeatingEle(arr));
        System.out.println("***************************");

        System.out.println("Min repeating Ele : " + minRepeatingEle(arr));

    }

    public static void frequency(int[] arr) {

        boolean[] trace = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (trace[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    trace[j] = true;
                }
            }

            System.out.println(arr[i] + " : " + count);
        }

    }

    public static void duplicate(int[] arr) {

        boolean[] trace = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (trace[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    trace[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " : " + count);
            }
        }
    }

    public static void distinct(int[] arr) {
        boolean[] trace = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (trace[i] == true)
                continue;

            // int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // count++;
                    trace[j] = true;
                }
            }

            System.out.println(arr[i]);
        }
    }

    public static void unique(int[] arr) {
        boolean[] trace = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (trace[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    trace[j] = true;
                }

            }

            if (count == 1) {
                System.out.println(arr[i]);
            }
        }

    }

    public static int maxRepeatingEle(int[] arr) {

        int max = Integer.MIN_VALUE;
        int ele = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ele = arr[i];
            }
        }

        return ele;
    }

    public static int minRepeatingEle(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minEle = 0;
        for (int i = 0; i < arr.length; i++) {

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count < min) {
                min = count;
                minEle = arr[i];
            }
        }

        return minEle;
    }
}