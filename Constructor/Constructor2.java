class Example1 {
    int a;

    Example1() {
        this(10);
        System.out.println("Example1()");
    }

    Example1(int a) {
        this(a, "Hello");
        System.out.println("Example1(int a)");
    }

    Example1(int a, String b) {
        System.out.println("Example1(int a, String b)");
    }
}

public class Constructor2 {

    public static void main(String[] args) {
        System.out.println("Starts");
        Example1 obj = new Example1();
        System.out.println("Ends");
    }
}