class Google {
    String firstName;
    String lastName;
    String emailId;
    String password;
    long contact;
    String gender;

    Google(String firstName, String emailId, String password, long contact, String gender) {
        this(firstName, "", emailId, password, contact, gender);
    }

    Google(String firstName, String emailId, String password, long contact) {
        this(firstName, emailId, password, contact, "Rather not to say");
    }

    Google(String firstName, String emailId, String password) {
        this(firstName, emailId, password, 0);
    }

    Google(String firstName, String lastName, String emailId, String password, long contact, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.password = password;
        this.contact = contact;
        this.gender = gender;
    }

    public void displayGoogle() {
        System.out.println("\nGoogle Details : ");
        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Email : " + emailId);
        System.out.println("Password : " + password);
        System.out.println("Contact : " + contact);
        System.out.println("Gender : " + gender);
    }
}

public class GoogleDriver {

    public static void main(String[] args) {
        Google om = new Google("Om", "Kumar", "om@gmail.com", "om@123", 9876543210l, "Male");
        Google jay = new Google("Jay", "jay@gmail.com", "jay@123", 1234567890l);

        om.displayGoogle();
        jay.displayGoogle();
    }
}