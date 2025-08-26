public class StaticVarExample {

    static String str = "Static var";

    static {
        System.out.println(str + " Static block");
    }

    {
        System.out.println(str + "non-Static block");
    }

    public StaticVarExample() {
        System.out.println(str + " constructor");
    }

    public static void m1() {
        System.out.println(str + " m1()");
    }

    public void m2() {
        System.out.println(str + " m2()");
    }

    public static void main(String[] args) {
        m1();
    }
}