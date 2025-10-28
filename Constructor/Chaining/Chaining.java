class Parent {
    String a;
    int b;

    Parent(String a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public void displayParent() {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}

class Child extends Parent {
    String c;
    int d;

    Child(String a, int b, String c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    public void displayChild() {
        System.out.println("c : " + c);
        System.out.println("d : " + d);
    }
}

public class Chaining {

    public static void main(String[] args) {
        Child c = new Child("Parent", 3, "Child", 4);
        c.displayChild();
        c.displayParent();
    }
}