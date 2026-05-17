public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 13;

        series(n);
    }

    public static void series(int n ){
        int first = 0;
        int second = 1;

        for(int i=1;i<=n;i++){
            int next = first + second;

            System.out.println(first+" ");

            first = second;
            second = next;
        }
    }
}