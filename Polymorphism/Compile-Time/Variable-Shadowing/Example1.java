public class Example1 {
    String str = "Instance var";

    public Example1() {
        String str = "Local Constructor var";
        System.out.println(str);
        System.out.println("From Constructor :" + this.str);
        System.out.println();
    }

    {
        String str = "blcok var";
        System.out.println(str);
        System.out.println();
    }

    public void m1() {
        String str = "Local method var";
        System.out.println(str);
        System.out.println(this.str);
        System.out.println();
    }

    public static void main(String[] args) {
        new Example1().m1();
    }
}