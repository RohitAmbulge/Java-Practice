class Address {
    String lane;
    String locality;
    String city;
    int pincode;

    Address(String lane, String locality, String city, int pincode) {
        this.lane = lane;
        this.locality = locality;
        this.city = city;
        this.pincode = pincode;
    }

    public void displayAddress() {
        System.out.println("\n Address ");
        System.out.println("Lane : " + lane);
        System.out.println("Locality : " + locality);
        System.out.println("City : " + city);
        System.out.println("Pincode : " + pincode);
    }
}

class Amazon {
    String username;
    String password;
    long contact;
    String email;
    Address address;

    Amazon() {
        super();
    }

    Amazon(String username, String password, long contact, String email, Address address) {
        super();
        this.username = username;
        this.password = password;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }

    public void displayAmazonInfo() {
        System.out.println("\nAmazon Info ");
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        System.out.println("Contact : " + contact);
        System.out.println("Email : " + email);
        address.displayAddress();
    }
}

class Bank {
    String name;
    String ifscCode;
    long accountNum;
    double balance;

    Bank(String name, String ifscCode, double balance) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNum = 4569871230l;
        this.balance = balance;
    }

    public void displayBank() {
        System.out.println("\n Bank Details : ");
        System.out.println("name : " + name);
        System.out.println("Ifsc Code : " + ifscCode);
        System.out.println("Account Number : " + accountNum);
        System.out.println("Balance : " + balance);
    }

}

class AmazonPay extends Amazon {
    String upiId;
    Bank bank;
    int pin;
    double wallet;

    AmazonPay() {

    }

    AmazonPay(String upiId, Bank bank, int pin, double wallet, String username, String password, long contact,
            String email, Address address) {
        super(username, password, contact, email, address);
        this.upiId = upiId;
        this.bank = bank;
        this.pin = pin;
        this.wallet = wallet;
    }

    public void displayAmazonPay() {
        displayAmazonInfo();
        System.out.println("\n Amazon Pay ");
        System.out.println("Upi id : " + upiId);
        System.out.println("Pin : " + pin);
        System.out.println("Wallet : " + wallet + "rs.");
        bank.displayBank();
    }
}

public class AmazonDriver {
    public static void main(String[] args) {
        // String lane, String locality, String city, int pincode){
        Address address = new Address("FC Road", "Deccan", "Pune", 401105);
        // String name, String ifscCode, double balance
        Bank bank = new Bank("SBI", "4464334663", 500000);
        // String upiId, Bank bank, int pin, double wallet, String username, String
        // password, long contact,
        // String email, Address address
        AmazonPay pay = new AmazonPay("sbi@ybl123", bank, 1234, 20000, "rohit", "Rohit@2003", 987654321l,
                "rohit@gmail.com", address);
        pay.displayAmazonPay();
    }
}
