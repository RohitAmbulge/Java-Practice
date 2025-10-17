class Amazon {
    private String username;
    private String email;
    private String password;
    private long contact;
    private String gender;
    private String address;

    Amazon(String username, String email, String password, long contact, String gender, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.contact = contact;
        this.gender = gender;
        this.address = address;
    }

    public void getAmazonInfo() {
        System.out.println("Amazon Account Details : ");
        System.out.println("Username : " + username);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Contact : " + contact);
        System.out.println("Gender : " + gender);
        System.out.println("Address : " + address);
    }
}

class AmazonPrime extends Amazon {
    private String[] profiles;
    private String password;0
    private String sub;
    private double price;
    private int users;

    AmazonPrime(String username, String email, String password, long contact, String gender, String address,
            String primePassword, String sub, double price, int users, String[] profiles) {
        super(username, email, password, contact, gender, address);
        this.password = primePassword;
        this.sub = sub;
        this.price = price;
        this.users = users;
        this.profiles = profiles;

    }

    public void getAmazonPrimeInfo() {
        getAmazonInfo();
        System.out.println("----------------");
        System.out.println("Details of Amazon Prime Info : ");
        System.out.println("Subscription : " + sub);
        System.out.println("Price :" + price);
        System.out.println("Users : " + users);
        for (String profile : profiles) {
            System.out.println(profile);
        }
    }
}

public class SingleLevelInheritance2 {

    public static void main(String[] args) {
        String[] profiles = { "Prime video", "Prime Music", "Free Delivery" };
        AmazonPrime obj = new AmazonPrime("Rohit", "rohit@gmail.com", "Rohit@123", 9876543210l, "Male", "Pune",
                "Rohit@prime", "Monthly", 399.0, 2, profiles);

        obj.getAmazonPrimeInfo();
    }
}