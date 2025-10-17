class Restaurant {
    private String name;
    private String location;
    private String ownerName;
    private int seatingCapacity;
    private String[] menu;

    Restaurant(String name, String location, String ownerName, int seatingCapacity, String[] menu) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
        this.seatingCapacity = seatingCapacity;
        this.menu = menu;
    }

    public void getRestaurantInfo() {
        System.out.println("Restaurant Details : ");
        System.out.println("Name : " + name);
        System.out.println("Location : " + location);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Seating capacity : " + seatingCapacity);

        for (String dish : menu) {
            System.out.println(dish);
        }
    }
}

class OnlineRestaurant extends Restaurant {
    private double rating;
    private double deliveryCharge;
    private String deliveryPartner;
    private boolean isOpen;
    private int activeOrders;

    OnlineRestaurant(String name, String location, String ownerName, int seatingCapacity, String[] menu, double rating,
            double deliveryCharge, String deliveryPartner, boolean isOpen, int activeOrders) {
        super(name, location, ownerName, seatingCapacity, menu);
        this.rating = rating;
        this.deliveryCharge = deliveryCharge;
        this.deliveryPartner = deliveryPartner;

        this.isOpen = isOpen;
        this.activeOrders = activeOrders;
    }

    public void getOnlineRestaurantDetails() {
        getRestaurantInfo();

        System.out.println("--------\n");
        System.out.println("Online Restaurant Details : ");
        System.out.println("Rating : " + rating);
        System.out.println("Delivary Cares : " + deliveryCharge);
        System.out.println("Currenty Open : " + (isOpen ? "Yes" : "No"));
        System.out.println("Active Orders : " + activeOrders);

    }
}

public class Example3 {

    public static void main(String[] args) {
        String[] menu = { "Pooran Poli", "Zunka Bhakar", "Dal Bhaat", "Bharit", "Modak" };
        OnlineRestaurant res = new OnlineRestaurant("Pisat", "Pune", "Rohit", 40, menu, 4.99, 37.8, "Zomato", true,
                26);

        res.getOnlineRestaurantDetails();
    }
}