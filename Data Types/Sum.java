public class Sum {

    public void fun(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Sum obj = new Sum();

        int num = 9;
        obj.fun(num);
    }
}
