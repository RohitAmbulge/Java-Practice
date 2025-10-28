import java.util.Scanner;
import java.util.Iterator;

class Bank {
    String name;
    long accNumber;
    long atmNumber;
    int cvv;

    public Bank(String name, long accNumber, long atmNumber, int cvv) {
        this.name = name;
        this.accNumber = accNumber;
        this.atmNumber = atmNumber;
        this.cvv = cvv;
    }

    public String displayBank() {
        return "Bank [name =" + name + ", account number " + accNumber + ", atm number = " + atmNumber + ", cvv =" + cvv
                + "]";
    }
}

class Payment {
    String name;
    String emailId;
    long contact;
    Bank bank;

    public Payment(String name, String emailId, long contact, Bank bank) {
        super();
        this.name = name;
        this.emailId = emailId;
        this.contact = contact;
        this.bank = bank;
    }

    public String displayPayment() {
        return "Payment [name =" + name + ", Email Id " + emailId + ", Contact = " + contact + ", bank =" + bank + "]";
    }

    public void paymentMethod(Payment obj) {
        if (obj instanceof PhonePay) {
            PhonePay obj1 = (PhonePay) obj;
            System.out.println(obj.paymentOption);
        }
    }
}

public class PaymentDetails {

}
