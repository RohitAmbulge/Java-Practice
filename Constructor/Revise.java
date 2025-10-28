import java.util.ArrayList;
import java.util.Scanner;

class Google {
    String fName;
    String lName;
    String email;
    long contact;
    String password;
    String dob;
    String gender;

    Google(String fName, String lName, String email, long contact, String password, String dob, String gender) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.dob = dob;
        this.gender = gender;

    }

    public void displayGoogle() {
        System.out.println(" Google Acc. Details : ");
        System.out.println("Username : " + fName + " " + lName);
        System.out.println("Email : " + email);
        System.out.println("Contact : " + contact);
        System.out.println("Password : " + password);
    }
}

class GoogleMeet extends Google {
    String hostName;
    String schedule;
    String link;
    String id;
    final int capacity = 100;
    int join;

    GoogleMeet(String fName, String lName, String email, long contact, String password, String dob, String gender,
            String hostName, String schedule, String link, String id, int join) {
        super(fName, lName, email, contact, password, dob, gender);
        this.hostName = hostName;
        this.schedule = schedule;
        this.link = link;
        this.id = id;
        this.join = join;
    }

    public void displayGoogleMeet() {
        displayGoogle();
        System.out.println("Details of Google meet : ");
        System.out.println("Hostname : " + hostName);
        System.out.println("Schedule : " + schedule);
        System.out.println("Link : " + link);
        System.out.println("Id : " + id);
        System.out.println("Join : " + join);
    }
}

class GoogleClassRoom extends Google {
    String subject;
    String name;
    String code;
    String trainer;
    int noOfStudents;

    GoogleClassRoom(String fName, String lName, String email, long contact, String password, String dob, String gender,
            String subject, String name, String code, String trainer, int noOfStudents) {
        super(fName, lName, email, contact, password, dob, gender);
        this.subject = subject;
        this.name = name;
        this.code = code;
        this.trainer = trainer;
        this.noOfStudents = noOfStudents;
    }

    public void displayGoogleClassRoom() {
        System.out.println("Google Classroom Details : ");
        System.out.println("Subject : " + subject);
        System.out.println("Nmae : " + name);
        System.out.println("Code : " + code);
        System.out.println("Trainer : " + trainer);
        System.out.println("Number of Students : " + noOfStudents);
    }
}

class Bank {
    String name;
    long number;
    double balance;

    Bank(String name, long number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public void displayBank() {
        System.out.println("bank Details : ");
        System.out.println("Nmae : " + name);
        System.out.println("Number : " + number);
        System.out.println("Balance : " + balance);
    }
}

class GooglePay extends Google {
    long contact;
    String upiId;
    Bank bank = new Bank("SBI", 9876543210l, 500);
    int pin;

    GooglePay(String fName, String lName, String email, long contact, String password, String dob, String gender,
            long contact, String upiId, int pin) {
        super(fName, lName, email, contact, password, dob, gender);
        this.contact = contact;
        this.upiId = upiId;
        this.pin = pin;

    }

    public void displayGooglePay() {
        displayGoogle();
        System.out.println("Google Pay Details : ");
        System.out.println("Contact : " + contact);
        System.out.println("UPIID : " + upiId);
        System.out.println("Pin : " + pin);
        bank.displayBank();
    }
}

public class Revise {

    public static void main(String[] args) {

        ArrayList<Product> basket = new ArrayList<>();
        Product p1 = new Product();
        p1.name = "Marker";
        p1.price = 30;

        Product p2 = new Product();
        p2.name = "Bislery";
        p2.price = 20;

        basket.add(p1);
        basket.add(p2);

        for (Product p : basket) {
            System.out.println(p.displayProduct());
        }

    }
}