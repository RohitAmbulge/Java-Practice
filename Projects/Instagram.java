import java.util.Scanner;

class DataBaseConnection {
    private final String DATA_BASE_NAME;
    private final String DB_USER;
    private final String DB_PASSWORD;

    private static DataBaseConnection obj;

    private DataBaseConnection() {
        super();
    }

    {
        this.DATA_BASE_NAME = System.getenv("dataBaseName");
        this.DB_USER = System.getenv("dbUser");
        this.DB_PASSWORD = System.getenv("dbPass");
    }

    public static DataBaseConnection getInstance() {
        if (obj != null) {
            return obj;
        }
        obj = new DataBaseConnection();

        return obj;

    }

    public void getConnection(String url, String dbUser, String dbPass) {
        if (this.DB_USER.equals(dbUser) && this.DB_PASSWORD.equals(dbPass)) {
            System.out.println("DB Connection Successful");
        } else {
            System.out.println("DB Connection Failed");
        }
    }

}

class AccountUser {
    String name;
    String user;
    String email;
    long contact;
    String password;

    AccountUser(String name, String email, String password, long contact) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.contact = contact;

    }

    public void displayUserAccount() {
        System.out.println("\n********* USER INFO *******");
        System.out.println("Name : " + name);
        System.out.println("Password : " + password);
        System.out.println("Contact : " + contact);
        System.out.println("Email : " + email);
    }
}

class Intagram {
    AccountUser user;
    boolean flag = false;

    {
        // DB Connection Build
        DataBaseConnection obj1 = DataBaseConnection.getInstance();
        final String DATA_BASE_NAME = System.getenv("dataBaseName");
        String url = "jdbc:mysql://localhost:3306/" + DATA_BASE_NAME;
        String dbUser = "scott";
        String dbPass = "tiger";

    }
}

public class Instagram {

}
