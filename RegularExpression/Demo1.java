public class Demo1 {
    public static void main(String[] args) {
        // String s = "AFT78437abc";
        // System.out.println(s.matches("^[0-9]+.*[a-z]+$"));

        //Create RE that accept 10 digits number only
        // String s1 = "67253658975033253";
        // System.out.println(s1.matches("[0-9]{10}"));

        //Write a RE to match email address
        // String email = "test@gmail.com";
        // System.out.println(email.matches("^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$"));

        //Write a RE for matching username that contain numbers, letters and @,$ only
        String name = "ldjv83478@$";
        System.out.println(name.matches("[0-9a-zA-Z@$]+$"));
    }
}