public class Demo {

    static int a = 20;

    static {
        System.out.println(a);
        System.out.println("hi");
        // System.out.println/'(a);
        a = 10;
        a= 30;
    }

    public static void main(String[] args) {
        System.out.println(a);

    }
}