class SuperClass {
    public static void m1() {
        System.out.println("Super class");
    }
}

class SubClass extends SuperClass {
    public static void m1() {
        System.out.println("Sub Class");
    }
}

public class Example1 {

    public static void main(String[] args) {
        // SubClass.m1();
        // SuperClass.m1();

        new SubClass().m1();
    }
}