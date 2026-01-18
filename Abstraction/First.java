abstract class Parent {
    int a;
    int b;

    Parent(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    abstract int addition();
}

class Child extends Parent {
    int c;
    int d;

    public Child(int a, int b, int c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    @Override
    public int addition() {
        return a + b + c + d;
    }
}

public class First {
    public static void main(String[] args) {
        Parent c = new Child(2, 4, 5, 7);
        int op = c.addition();
        System.out.println(op);
    }

}
