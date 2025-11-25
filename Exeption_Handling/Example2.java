public class Example2 {

    public static void main(String[] args) {
        System.out.println("Main Starts");
        m1();
        System.out.println("Main Ends");
    }

    public static void m1() {
        System.out.println("M1() starts");
        m2();
        System.out.println("M1() ends");
    }

    public static void m2() {
        System.out.println("M2() starts");
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Exception Handeled");
        }

        System.out.println("m2() ends");
    }
}