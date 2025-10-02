class PhonePay {
    private double balance = 20000;
    int storePin = 1234;

    public double getBalance() {
        return balance;
    }
}

public class PhonePayDriver {

    public static void main(String[] args) {
        PhonePay obj = new PhonePay();
        System.out.println(obj.getBalance());
        int userPin = 1234;

        if (userPin == obj.storePin) {
            System.out.println(obj.getBalance());
        } else {
            System.out.println("Invalid Pino");
        }
    }
}