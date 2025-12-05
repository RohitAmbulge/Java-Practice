public class Example4 {

    public static void main(String[] args) {
        System.out.println("Starts");
        try {
            System.out.println("try");
            try {
                System.out.println("inner try");
                System.out.println(args[0]);
            } catch (NullPointerException e) {
                System.out.println("inner catch");
            }
        } catch (ArithmeticException e) {
            System.out.println("outer catch 1");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch 2");
        }
    }
}