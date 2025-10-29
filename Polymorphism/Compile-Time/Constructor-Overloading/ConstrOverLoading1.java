class Demo {
    Demo() {
        System.out.println("Hello");
    }

    Demo(int a) {
        System.out.println("Demo(int a)");
    }

    Demo(String s) {
        System.out.println("Demo(String s)");
    }
}

public class ConstrOverLoading1 {

    public static void main(String[] args) {
        new Demo();
        new Demo(1);
        new Demo("Rohit");

    }
}