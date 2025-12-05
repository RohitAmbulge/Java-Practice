public class Example1 {

    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println(10 / 0);
        } catch (NullPointerException e) {
            System.out.println("Catch 1");
        } catch (ArithmeticException ae) {
            System.out.println("Catch 2");
        } catch (Exception e) {
            System.out.println("Catch 3");
        }
    }
}