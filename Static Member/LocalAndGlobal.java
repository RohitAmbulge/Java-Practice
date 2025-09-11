public class LocalAndGlobal {

    static String str;
    static int str1;

    static {
        str = "Global Var";
    }

    public static void main(String[] args) {
        String str = "Local Var";
        System.out.println(str);
        System.out.println(LocalAndGlobal.str);
        System.out.println(new LocalAndGlobal().str1);
    }
}