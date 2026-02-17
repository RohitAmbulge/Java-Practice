public class scp {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");
        String z = new String("Hello");
        String c = "Java";
        String con = a+c;
        String d = "HelloJava";
        // String b = new String("Hello").intern();
        // System.out.println(a == b);
        System.out.println(b == z);

        System.out.println("a  : "+a.hashCode());
         System.out.println("d  : "+d.hashCode());
    }
}