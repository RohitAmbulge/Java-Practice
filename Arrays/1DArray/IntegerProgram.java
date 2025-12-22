public class IntegerProgram {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 9, 5, 6, 3, 4, 6, 8, 7 };

        frequency(arr);

        System.out.println("***************************");

        duplicate(arr);
        System.out.println("***************************");

        distinct(arr);

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

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    trace[i] = false;
                }
            }

            System.out.println(arr[i]);
        }
    }
}