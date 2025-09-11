class Example {
    static int count = 1;

    Example() {
        System.out.println("Example Constructor");
    }

    {
        System.out.println("Non-static block Example");
    }
}

public class NonStaticEx1 {
    public static void main(String[] args) {
        new Example();
    }
}