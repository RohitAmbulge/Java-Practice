class Demo1 {
    String a;
    int b;

    Demo1(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public void displayDemo1() {
        System.out.println("Class Demo1()");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}

class Demo2 extends Demo1 {
    String c;
    int d;

    Demo2(String c, int d) {
        this.c = c;
        this.d = d;
    }

    Demo2(Demo2 oldObj){
        super()
    }
}

public class CopyConstructorDriver {

}
