public class Example3 {

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println(args[0]);
        } catch (RuntimeException e) {
            System.out.println("Exception handeled");
        }
    }
}