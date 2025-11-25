public class Example1 {

    public static void main(String[] args) {
        System.out.println("main Starts");
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Exception Handeled : " + e);
        }

        System.out.println("Main Ends");
    }
}