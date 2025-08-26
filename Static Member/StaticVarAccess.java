class StaticVar {

    static int a = 10;

    public static void main(String[] args) {
        SecondClass.m1();
        new SecondClass().m2();
    }
}

class SecondClass {

    static int b = StaticVar.a;

    public static void m1() {
        System.out.println(StaticVar.a);
        System.out.println(b);
        System.out.println("m1() static second class");
    }

    public void m2() {
        System.out.println(StaticVar.a);
        System.out.println(b);
        System.out.println("m2() non-static example");
    }
}