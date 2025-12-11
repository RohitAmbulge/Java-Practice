
public class ExampleDriver {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 'A'; i <= 'z'; i++) {
            System.out.println(i++);
            Thread.sleep(1000);
        }
    }
}