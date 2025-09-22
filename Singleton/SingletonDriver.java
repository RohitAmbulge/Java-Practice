class ConnectionDatabase {
    private static ConnectionDatabase obj;
    String username;
    String password;

    private ConnectionDatabase(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public static ConnectionDatabase getInstance(String username, String password) {
        if (obj == null) {
            obj = new ConnectionDatabase(username, password);
        }
        return obj;
    }

    public void connectionWithDatabase() {
        System.out.println("User you have connected with databasse ");
        System.out.println("Database credentials \nusername : " + username + "\npassword : " + password);
        System.out.println(obj);
    }
}

public class SingletonDriver {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin@123";

        ConnectionDatabase.getInstance(username, password).connectionWithDatabase();

        System.out.println("*************");
        // ConnectionDatabase obj2 = ConnectionDatabase.getInstance(username, password);
        // obj2.connectionWithDatabase();
    }

}
