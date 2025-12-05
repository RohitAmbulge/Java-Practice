public class Example5 {

    public static void main(String[] args) {
        System.out.println("Starts");
        try {
            System.out.println("Outer try");
            try {
                System.out.println("inner try");
                System.out.println(args[0]);
            } catch (Exception e) {
                System.out.println("inner catch");
                System.out.println(10 / 0);
            }
        } catch (ArithmeticException a) {
            System.out.println("Outer catch1");
        } catch (RuntimeException e) {
            System.out.println("Outer catch2");
        }
    }

}