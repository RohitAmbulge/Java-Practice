import java.util.Scanner;

public class PersonalInfo {

    public static void personal() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Address : ");
        String address = sc.nextLine();

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Address is : " + address);

    }

    public static void main(String[] args) {
        personal();
    }
}