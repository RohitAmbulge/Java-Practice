public class Demo{
    public static void main(String[] args ){
        // String a = "Hello";
        // String b = "Hello";
        // String c = new String("World").intern();

        // System.out.println(a == b);
        // System.out.println(a == c);

        String a = "Hello";
        String b = "Java";
        String c = a+b;
        String d = "HelloJava";
        System.out.println(c == d);
        System.out.println(c.equals(d));
    }
}