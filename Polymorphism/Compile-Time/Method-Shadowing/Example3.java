class Parent {
    public void m2() {
        System.out.println("Parent m2()");
    }
}

class Child extends Parent {
    public void m2(int a) {
        System.out.println("Child m2()");
    }
}

public class Example3 {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.m2();
        obj.m2(4);
    }
}