public class NegativeSize {

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(args));
        System.out.println(args.length);
        int[] arr = new int[-12];
    }
}