public class IOOBE {

    public static void main(String[] args) {
        System.out.println("Starts");
        try {
            System.out.println("Hello".charAt(6));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handeled");
        }
        System.out.println("Ends");
    }
}