class Parent {
}

class Child1 extends Parent {
}

class GrandChild1 extends Child1 {
}

class Child2 extends Parent {
}

class GrandChild2 extends Child2 {
}

public class ClassCastExc {

    public static void main(String[] args) {
        System.out.println("main starts");
        Child1 c = new GrandChild1();
        Parent c1 = new Child1();
        Child2 c2 = (Child2) c1;
        System.out.println("ends");
    }
}