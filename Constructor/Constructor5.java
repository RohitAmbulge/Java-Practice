class Parent {
    // int a;
    Parent(int a) {
        super();
        // this.a = a;
        System.out.println(a);
    }

}

class Child extends Parent {
    // int b;
    Child(int a, int b) {
        super(a);
        // this.b = b;
        System.out.println(b);
    }

}

public class Constructor5 {
    public static void main(String[] args) {
        Child obj = new Child(2, 3);
    }
}
