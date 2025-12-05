public class Example2 {

    public static void main(String[] args) {
        System.out.println("Main Starts");
        try {
            System.out.println("try");
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Catch1");
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch2");
        }

        System.out.println("Ends");
    }
}