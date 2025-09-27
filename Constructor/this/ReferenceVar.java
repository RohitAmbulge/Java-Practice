class Parent {
    public void m1() {
        System.out.println("m1() Parent");
    }
}

class Child extends Parent {
    public void m1() {
        System.out.println("m1() child");
        System.out.println(this);
        // System.out.println(super);

    }
}

public class ReferenceVar {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.m1();
        System.out.println(obj);
    }
}