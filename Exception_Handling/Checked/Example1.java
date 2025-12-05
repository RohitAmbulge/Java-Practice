public class Example1 {

    public static void main(String[] args) {
        System.out.println("Main Starts");
        try {
            System.out.println("try");
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Catch1");
            System.out.println(args[0]);
        }

        try {
            System.out.println("try2");
            System.out.println("Hello");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch2");
        }

        System.out.println("Main ends");
    }
}