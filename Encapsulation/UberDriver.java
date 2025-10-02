import java.util.Scanner;
import java.util.ArrayList;

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

    Cab(String number, String type, Driver driver) {
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
        this.driver = driver;
    }

    public void getCabDetails() {
        System.out.println("\n Cab Details ");
        System.out.println("Uber Id : " + uberId);
        System.out.println("Status : " + status);
        System.out.println("Cab Number : " + number);
        System.out.println("Type : " + type);
        System.out.println("Capacity : " + capacity);
        System.out.println("Location : " + location);

        System.out.println("");
    }

    public String getCabNumber() {
        return number;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getUberId() {
        return uberId;
    }
}

public class UberDriver {
    public static void main(String[] args) {
        Uber uber = new Uber();
        uber.homeModule();
    }
}

class Passenger {
    private String name;
    private long contact;
    private String email;
    private String pickupLocation;
    private String dropLocation;
    private int seats;

    Passenger(String name, long contact, String email, String pickupLocation, String dropLocation, int seats) {
        super();
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long newContact) {
        this.contact = newContact;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String newPickupLocation) {
        this.pickupLocation = newPickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String newDropLocation) {
        this.dropLocation = newDropLocation;
    }

    public int getSeats() {
        return this.seats;
    }

    public void setSeats(int newSeats) {
        this.seats = newSeats;
    }
}

class Uber {
    ArrayList<Cab> listCabs = new ArrayList<Cab>();
    Passenger passenger;
    Cab currentCab;

    {
        Cab cab1 = new Cab("MH-01-AA-1234", "sedan", new Driver("Ramesh Kumar", 987654321l));
        Cab cab2 = new Cab("MH-12-AA-2334", "suv", new Driver("Suresh Kumar", 987454321l));
        Cab cab3 = new Cab("MH-14-AA-1234", "hatchback", new Driver("Rajesh Kumar", 8877654321l));
        Cab cab4 = new Cab("MH-16-AA-2242", "muv", new Driver("Mahesh Kumar", 987654321l));
        Cab cab5 = new Cab("MH-01-AA-5675", "sedan", new Driver("Ganesh Kumar", 987654321l));
        listCabs.add(cab1);
        listCabs.add(cab2);
        listCabs.add(cab3);
        listCabs.add(cab4);
        listCabs.add(cab5);

    }

    {
        System.out.println(" Passenger Details ");
        System.out.println("Name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Contact : ");
        long contact = new Scanner(System.in).nextLong();
        System.out.println("Email : ");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Pickup Location : ");
        String pickup = new Scanner(System.in).nextLine();
        System.out.println("Drop Location : ");
        String drop = new Scanner(System.in).nextLine();
        System.out.println("Number of people : ");
        int seats = new Scanner(System.in).nextInt();

        this.passenger = new Passenger(name, contact, email, pickup, drop, seats);
    }

    public void homeModule() {
        for (;;) {
            System.out.println("\n WELCOME \n");
            System.out.println("1. Book a Ride");
            System.out.println("2. Cancel Ride ");
            System.out.println("3. Ride History");
            System.out.println("4. Logout \n");
            System.out.println("Enter your response : ");
            int response = new Scanner(System.in).nextInt();

            switch (response) {
                case 1 -> bookRide();
                case 2 -> canceRide();
                case 3 -> rideHistory();
                case 4 -> {
                    System.out.println("Thank you for using uber");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Response");
            }
        }
    }

    public void bookRide() {
        System.out.println("\n Book-A-Ride Module\n");
        for (Cab element : listCabs) {
            if (element.getStatus() == "AVAIL"
                    && passenger.getSeats() <= element.getCapacity()) {
                element.getCabDetails();
            }
        }

        System.out.println("\nEnter the uberId : ");
        String uberId = new Scanner(System.in).next();
        boolean assump = false;

        for (Cab ele : listCabs) {
            if (ele.getUberId().equals(uberId)) {
                System.out.println("Your ride has been confirmed ");
                currentCab = ele;
                assump = true;
                System.out.println("Your ride details ");
                ele.getCabDetails();
                System.out.println("Cab Number : " + ele.getCabNumber());
                ele.getDriver().getDriver();
                break;
            }
        }

        if (!assump) {
            System.out.println("\n Invalid Uber Id");
        }
    }

    public void canceRide() {
        if (currentCab == null) {
            System.out.println(" \nNo Ride has been booked\n");
            return;
        }
        System.out.println("Cancel a ride module\n");
        System.out.println("Your ride details");
        currentCab.getCabDetails();
        System.out.println("Cab number : " + currentCab.getCabNumber());
        currentCab.getDriver().getDriver();

        System.out.println("Do you want to cancel your ride (yes/no)");
        String resp = new Scanner(System.in).next();
        if (resp.equalsIgnoreCase("YES")) {
            System.out.println("Your Ride has been cancelled");
            currentCab = null;
        }
    }

    public void rideHistory() {
        System.out.println("\n Ride-history module\n");
    }
}
