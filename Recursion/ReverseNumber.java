
public class ReverseNumber {
    static int num = 1234, temp = num;
    static int rev;

    public static void reverse() {
        rev = rev * 10 + (num % 10);
        num /= 10;

        if (num == 0)
            return;

        reverse();
    }

    public static void main(String[] args) {
        reverse();
        System.out.println("Reverse of " + temp + " is: " + rev);

    }
}