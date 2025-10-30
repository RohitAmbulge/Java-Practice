class ArithmaticOperatio {
    public static int addition(int a, int b) {
        return addition(a, b, 0);
    }

    public static int addition(int a, int b, int c) {
        return addition(a, b, c, 0);
    }

    public static int addition(int a, int b, int c, int d) {
        return addition(a, b, c, d, 0);
    }

    public static int addition(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static int optAddition(int... num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }

        return sum;
    }

}

public class Operation {

    public static void main(String[] args) {
        System.out.println(ArithmaticOperatio.addition(2, 3));
        System.out.println(ArithmaticOperatio.addition(2, 3, 4, 5));
        System.out.println(ArithmaticOperatio.optAddition(1, 2, 3, 4));
    }
}