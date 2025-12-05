public class Interrupted {

    public static void main(String[] args) {
        System.out.println("Starts");

        try {
            System.out.println("Hello Java");
            Thread.sleep(2000);
            System.out.println("Hello World");
        } catch (InterruptedException e) {
            System.out.println("Handeled");
        }

    }
}