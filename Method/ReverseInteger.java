public class ReverseInteger {

    public static int reverse(int num) {
        long rev = 0;

        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : (int) rev;
    }

    public static void main(String[] args) {
        int num = 127;

        System.out.println(reverse(num));
    }
}