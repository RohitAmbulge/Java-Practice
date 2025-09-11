class Example {
    Example() {
        System.out.println("Constructor of Example");
    }

    static {
        System.out.println("Static block Example");
    }

    {
        System.out.println("non-static block-Example");
    }

    void m1() {
        System.out.println("m1() non-static example");
    }
}

public class NonStaticEx2 {

    static Example obj = new Example();

    static {
        System.out.println("Static block of main class");
    }

    public static void main(String[] args) {
        System.out.println("main()");
        obj.m1();
    }

}
