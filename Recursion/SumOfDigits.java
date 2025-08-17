public class SumOfDigits {

    static int num = 123, dup = num;
    static int sum;

    public static void sumOf() {

        if (num == 0)
            return;

        sum = sum + (num % 10);
        num = num / 10;
        sumOf();

    }

    public static void main(String[] args) {
        sumOf();

        System.out.println("Sum of " + dup + " is : " + sum);

    }
}