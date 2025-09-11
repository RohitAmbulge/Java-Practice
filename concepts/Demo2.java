package concepts;

class Demo2 {
    public static void main(String[] args) {
        System.out.println("main()");
        m1();
    }

    public static void m1() {
        System.out.println("m1() static method");
    }

    public static void m2() {
        m1();
        System.out.println("m2() static method");
    }

    static {
        m1();
        System.out.println("static block");
    }
}
