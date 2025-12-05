public class Example3 {

    public static void main(String[] args) {
        System.out.println("Starts");
        try {
            System.out.println("try1");
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Catch1");
            try {
                System.out.println("inner try");
                System.out.println(args[0]);
            } catch (NullPointerException npe) {
                System.out.println("inner catch");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch");
        }
    }
}