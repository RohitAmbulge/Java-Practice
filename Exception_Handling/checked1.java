public class checked1 {

    public static void main(String[] args) throws Throwable {
        new Example().m1();

    }
}

class Example {
    public void m1() throws Throwable {
        System.out.println("Hello from m1()");
    }
}