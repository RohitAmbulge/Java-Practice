public class Numbers {
    static int num = 1;
    // static int n = 1;

    public static void printNumbers() {
        System.out.print(num + " ");
        if (num++ == 100)
            return;
        printNumbers();
    }

    public static void print(int n) {
        System.out.print(n + " ");
        if (n == 5)
            return;
        print(n++);
    }

    public static void main(String[] args) {
        printNumbers();

        // print(1);

    }
}