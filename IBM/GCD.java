public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        System.out.println(gcd2(a,b));
    }

    public static int gcd1(int a, int b){
        if(b == 0)return a;

        return gcd1(b,a%b);
    }

    public static int gcd2(int a, int b){

        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }
}