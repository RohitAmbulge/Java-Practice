public class MultipleStaticBlock {

    static {
        System.out.println("Static Block1");
    }

    static {
        System.out.println("Static Block2");
    }

    public static void main(String[] args) {
        System.out.println("main()");
        m1();
    }

    static {
        System.out.println("Static block3");
    }

    public static void m1() {
        System.out.println("static block4");
    }
}