public class Example1 {
    public static void main(String[] args) {
        String str = "Hello Java";

        for (int i = 0; i <= str.length(); i++) {
            System.out.println(str.charAt(i));
            // try {
            // System.out.println(str.charAt(i));
            // } catch (StringIndexOutOfBoundsException e) {
            // System.out.println("Handeled");
            // }
        }

    }
}