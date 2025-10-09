class Example {
    Example() {
        System.out.println("Constructor Example");
    }

    static {
        System.out.println("Static block example");
    }

    {
        System.out.println("Non static block example");
    }

    void m1() {
        System.out.println("m1() non-static example");
    }
}

public class Demo {

    static Example obj = new Example();

    static {
        System.out.println("Static block Example Demo ");
    }

    public static void main(String[] args) {
        System.out.println("main()");
        obj.m1();
    }
}