public class DriverClass {

    static {
        System.out.println("main static block");
    }

    public static void main(String[] args) {
        System.out.println("main()");
        System.out.println(Example.a);
    }
}

class Example {
    static int a = 123;
    static {
        System.out.println("Static block Example");
    }
}