class Vehicle {
    String brand;
    double price;
    String color;

    public Vehicle(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        System.out.println("Constructor");
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle("omni", 400000, "gray");
        System.out.println(obj.brand);
        System.out.println(obj.price);
        System.out.println(obj.color);

    }
}