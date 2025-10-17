class Vehicle {
    String brand;
    String model;
    int price;
    String manufactureDate;

    Vehicle(String brand, String model, int price, String manufactureDate) {
        super();
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public void getvehicleDetails() {
        System.out.println("Vehicle Details : ");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("ManufactureDate: " + manufactureDate);
    }

}

class Car extends Vehicle {
    boolean ac;
    int airBags;
    int doors;
    boolean sunRoof;
    String fuelType;

    Car(String brand, String model, int price, String manufactureDate, boolean ac, int airBags, int doors,
            boolean sunRoof, String fuelType) {
        super(brand, model, price, manufactureDate);
        this.ac = ac;
        this.airBags = airBags;
        this.doors = doors;
        this.sunRoof = sunRoof;
        this.fuelType = fuelType;
    }

    public void getCarDetails() {
        getvehicleDetails();
        System.out.println("Ac : " + ac);
        System.out.println("Air Bags : " + airBags);
        System.out.println("Doors : " + doors);
        System.out.println("Sun Roof : " + sunRoof);
        System.out.println("Fuel Type : " + fuelType);
    }

    public void vehicleStart() {
        System.out.println("Press a button to start ");
    }

    public void accelerate() {
        System.out.println("Use a pedal to move vehicle");
    }

}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        // String brand, String model, String price, String manufactureDate, boolean ac,
        // int airBags, int doors,
        // boolean sunRoof, String fuelType
        Car obj = new Car("Toyota", "Fortuner", 500000, "09/2024", true, 4, 5, true, "Petrol");
        obj.getvehicleDetails();
        obj.getCarDetails();
        obj.vehicleStart();
        obj.accelerate();
    }
}
