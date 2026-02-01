public class Demo2{
    public static void main(String[] args ){
        String a = "Hello";
        String b = new String("Hello");

        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        
    }
}