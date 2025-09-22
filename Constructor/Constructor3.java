class Demo {
    int a;
    int b;

    Demo(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
}

class Demo2 extends Demo {
    int c;
    int d;

    Demo2(int a, int b, int c, int d) {
        // super();
        super(a, b);
        this.c = c;
        this.d = d;

    }
}

public class Constructor3 {

    public static void main(String[] args) {
        Demo2 obj = new Demo2(10, 20, 30, 40);
        System.out.println("a : " + obj.a);
        System.out.println("b : " + obj.b);
        System.out.println("c : " + obj.c);
        System.out.println("d : " + obj.d);

    }
}