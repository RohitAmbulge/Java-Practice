public class DifferingBits {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 14;
        int count = 0;

        int xor = num1 ^ num2;

        while(xor  > 0){
            count += (xor & 1);
            xor = xor >> 1;
        }

        System.out.println(count);
    }
}