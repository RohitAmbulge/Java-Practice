class Google {
    String firstName;
    String lastName;
    String email;
    long contact;
    String password;
    String dob;
    String gender;

    Google(String firstName, String lastName, String email, long contact, String password, String dob, String gender) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
    }

    public void displayGoogle() {
        System.out.println("\n Google Account Details ");
        System.out.println("Username : " + firstName + " " + lastName);
        System.out.println("Email : " + email);
        System.out.println("Contact : " + contact);
        System.out.println("Password : " + password);
        System.out.println("DOB : " + dob);
        System.out.println("Gender : " + gender + " \n");
    }
}

class GoogleMeet extends Google {

    String hostName;
    String schedule;
    String link;
    String id;
    final int CAPACITY = 100;
    int join;

    GoogleMeet(String firstName, String lastName, String email, long contact, String password, String dob,
            String gender, String hostName, String schedule, String link, String id, int join) {
        super(firstName, lastName, email, contact, password, dob, gender);
        this.hostName = hostName;
        this.schedule = schedule;
        this.link = link;
        this.id = id;
        this.join = join;

    }

    public void displayGoogelMeet() {
        displayGoogle();
        System.out.println("\n Google Meet Details : ");
        System.out.println("Host Name : " + hostName);
        System.out.println("Schedule : " + schedule);
        System.out.println("Link : " + link);
        System.out.println("Id : " + id);
        System.out.println("Join : " + join);
        System.out.println();
    }
}

class GoogleClassRoom extends Google {
    String subject;
    String name;
    String code;
    String trainer;
    int numberOfStudents;

    GoogleClassRoom(String firstName, String lastName, String email, long contact, String password, String dob,
            String gender, String subject, String name, String code, String trainer, int numberOfStudents) {
        super(firstName, lastName, email, contact, password, dob, gender);
        this.subject = subject;
        this.name = name;
        this.code = code;
        this.trainer = trainer;
        this.numberOfStudents = numberOfStudents;
    }

    public void displayGoogleClassRoom() {
        System.out.println("\n Google Classroom Details ");
        System.out.println("Subject : " + subject);
        System.out.println("Name : " + name);
        System.out.println("Code : " + code);
        System.out.println("Trainer : " + trainer);
        System.out.println("Number of Students : " + numberOfStudents);
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
        System.out.println("\nBank Details : ");
        System.out.println("Name : " + name);
        System.out.println("Number : " + number);
        System.out.println("Balance : " + balance + "\n");
    }
}

class GooglePay extends Google {
    long contact;
    String upiId;
    Bank bank = new Bank("SBI", 9876543210l, 50000);
    int pin;

    GooglePay(String firstName, String lastName, String email, long contact, String password, String dob,
            String gender, long contact2, String upiId, int pin) {
        super(firstName, lastName, email, contact, password, dob, gender);
        this.contact = contact2;
        this.upiId = upiId;
        this.pin = pin;
    }

    public void displayGooglePay() {
        displayGoogle();
        System.out.println("\n GooglePay Details ");
        System.out.println("Contact : " + contact);
        System.out.println("UPI Id : " + upiId);
        System.out.println("pin : " + pin + "\n");
        bank.displayBank();
    }
}

public class GoogleDriver {
    public static void main(String[] args) {

        // Google Pay
        GooglePay gPay = new GooglePay("Rohit", "Ambulge", "rohit@gmail.com", 9876543210l, "rohit@2003", "24/09/2003",
                "male", 9876543210l, "sbi@ybl123", 123456);
        gPay.displayGooglePay();

        // Google Meet
        GoogleMeet gMeet = new GoogleMeet("Ankit", "Rasangir", "ankit@gmail.com", 9874561230l, "Ankit@2003",
                "01/01/2003", "male", "Rohit", "3:00pm to 4:00pm", "", "1234", 67);
        gMeet.displayGoogelMeet();

        // Google Classroom
        GoogleClassRoom gRoom = new GoogleClassRoom("Rohan", "Nachane", "rohan@gmail.com", 9638527410l, "rohan@2003",
                "23/04/2003", "male", "Java", "Rohan", "4567", "Shrikant", 56);
        gRoom.displayGoogleClassRoom();
    }

}
