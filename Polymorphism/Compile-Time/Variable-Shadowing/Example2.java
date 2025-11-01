
public class Example2 {

    String str = "Instance Var";
    int a;
    double b;

    Example2(String str, int a, double b) {
        this.a = a;
        this.b = b;
        System.out.println(str);
        System.out.println(this.str);
        System.out.println();
    }

    public void displayExample() {
        String str = "hi";
        System.out.println(a);
        System.out.println(b);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Example2 e = new Example2("Hello", 1, 2);
        e.displayExample();
    }
}