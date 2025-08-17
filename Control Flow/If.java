public class If {
    public static void main(String[] args) {
        int num = 20;
        String res5 = "Hi5";
        String res2 = "Hi2";

        if (num % 2 != 0) {
            res2 = "";
        }

        if (num % 5 != 0) {
            res5 = "";
        }

        System.out.println(res5 + " " + res2);
    }

}
