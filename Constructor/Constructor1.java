class Example1 extends Object {
    Example1() {
        super();
        System.out.println("Example1 parent");

    }
}

class Example2 extends Example1 {
    Example2() {
        super();
        System.out.println("Example2 child");
    }
}

public class Constructor1 {

    Constructor1() {
        super();
        System.out.println("from constr1");
    }

    public static void main(String[] args) {
        System.out.println("Starts");
        Example2 obj = new Example2();
        System.out.println("Ends");
    }
}