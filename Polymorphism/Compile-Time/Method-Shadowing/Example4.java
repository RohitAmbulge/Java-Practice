class User {
    public final void rules() {
        System.out.println("1. Login at time");
        System.out.println("2. Lunch Break at 1:30pm");
        System.out.println("3. Tea break whenever you want");
        System.out.println("4. Don't Sleep cameras are watching so keep smiling");
    }
}

class Admin extends User {
    static String username = "ADMIN";
    static String password = "ADMIN";

    public static void login(String username, String password) {
        if (username.equals(Admin.username) && password.equals(Admin.password)) {
            System.out.println("Admin Login Successful");
        } else {
            System.out.println("Admin Login Credentials Invalid");
        }
    }
}

class Employee extends Admin {
    static String username = "ramesh";
    static String password = "ramesh@123";

    public static void login(String username, String password) {
        if (username.equals(Employee.username) && password.equals(Employee.password)) {
            System.out.println("Employee Login Successful");
        } else {
            System.out.println("Employee Login Credentials Invalid");
        }
    }
}

public class Example4 {

    public static void main(String[] args) {
        Admin obj = new Employee();
        obj.rules();
        obj.login("ADMIN", "ADMIN");

        Employee obj1 = (Employee) obj;
        obj1.rules();
        obj1.login("ramesh", "ramesh@123");
    }
}