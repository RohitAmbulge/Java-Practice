package concepts;

class Demo3 {
    Demo3() {
        m1();
        m2();
    }

    {
        m1();
        m2();
    }

    static {
        m1();

    }

    public static void m1() {
        System.out.println("m1() static method");
    }

    public void m2() {
        m1();
        System.out.println("m2() non-static method");
    }

    public static void main(String[] args) {

    }

}
