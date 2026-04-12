public class StrongNumber {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(isStrong(num));
    }

    public static boolean isStrong(int num){
        int sum = 0;
        int temp = num;

        while(num != 0){
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return (temp == sum);
    }

    public static int factorial(int num){
        int res = 1;

        for(int i=1;i<=num;i++){
            res *= i;
        }

        return res;
    }

}