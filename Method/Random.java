public class Random {

    public static void printRandomNum() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.floor(Math.random() * 10 + 1));
        }
    }

    public static void main(String[] args) {
        printRandomNum();

    }
}