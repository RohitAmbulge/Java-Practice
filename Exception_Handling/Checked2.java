public class Checked2 {

    public static void main(String[] args) {
        // new Example().m1();
        try {
            new Example().m1();
        } catch (Throwable e) {
            System.out.println("Handeled");
        }
    }
}

class Example {
    public void m1() throws Throwable {
        System.out.println("Hello from m1()");
    }
}