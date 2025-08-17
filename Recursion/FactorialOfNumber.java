public class FactorialOfNumber {

    static int num = 5, temp = num;
    static int fac = 1;

    public static void factorial() {
        fac = fac * num;
        num--;
        if (num == 1)
            return;
        factorial();
    }

    public static void main(String[] args) {
        factorial();

        System.out.println("Factorial of " + temp + " is: " + fac);

    }
}