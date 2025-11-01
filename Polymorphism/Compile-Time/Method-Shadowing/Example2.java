class SuperClass {
    public static void m1() {
        System.out.println("Super Class");
    }
}

class SubClass extends SuperClass {
    public static void m1() {
        System.out.println("Subclass");
    }
}

public class Example2 {

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.m1();

        SuperClass obj2 = new SuperClass();
        obj2.m1();

        SuperClass obj3 = new SubClass();
        obj3.m1();

        SubClass obj4 = (SubClass) obj3;
        obj4.m1();

    }
}