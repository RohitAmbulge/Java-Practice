class Parent {
    public void m1() {
        System.out.println("m1() from parent");
    }

    public void m2() {
        System.out.println("m2() from parent");
    }
}

class Child extends Parent {
    public void m1() {
        System.out.println("m1() from child");
    }

    public void m3() {
        System.out.println("m3() from child");
    }
}

public class Demo {

    public static void main(String[] args) {

        Parent c = new Child();
        c.m1();

    }
}