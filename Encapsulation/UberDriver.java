import java.util.Scanner;

class Driver {
    private String name;
    private long contact;

    Driver(String name, long contact) {
        this.name = name;
        this.contact = contact;
    }

    public void getDriver() {
        System.out.println("\n   Driver Info  ");
        System.out.println("Driver : " + name);
        System.out.println("Contact : " + contact + "\n");
    }
}

class Cab {
    static int id = 353345;
    private Driver driver;
    private String number;
    private String uberId;
    private String type;
    private int capacity;
    private String status = "AVAIL";
    private String location = "DECCAN";

    String[] typeVehicle = { "hatchback", "sedan", "suv", "muv" };
    int[] vehicleCapacity = { 3, 4, 5, 6 };

    {
        this.uberId = "UBER" + id++;

    }

    Cab(String number, String type) {
        this.number = number;
        this.type = type.toLowerCase();

        int index = 0;
        for (String element : typeVehicle) {
            if (type.toLowerCase().equals(element)) {
                break;
            }
            index++;
        }
        this.capacity = vehicleCapacity[index];

        System.out.println("Enter the driver details : ");
        System.out.println("Enter a name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter the contact number: ");
        long contact = new Scanner(System.in).nextLong();
        this.driver = new Driver(name, contact);
    }

    public void getCabDetails() {
        System.out.println("\n Cab Details ");
        System.out.println("Uber Id : " + uberId);
        System.out.println("Status : " + status);
        System.out.println("Cab Number : " + number);
        System.out.println("Type : " + capacity);
        System.out.println("Location : " + location);
        driver.getDriver();
        System.out.println("");
    }
}

public class UberDriver {
    public static void main(String[] args) {
        System.out.println("\n WELCOME \n");
        System.out.println("Enter cab number : ");
        String cabNumber = new Scanner(System.in).next();
        System.out.println("Type of cab : ");
        String type = new Scanner(System.in).next();
        Cab cab1 = new Cab(cabNumber, type);
        cab1.getCabDetails();
    }
}
