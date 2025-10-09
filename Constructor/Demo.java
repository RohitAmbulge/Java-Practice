import java.util.ArrayList;

class Product {
    static int serialNumber = 23423;
    String productId;
    String name;
    double price;

    Product() {
        super();
        productId = "PRODID" + serialNumber++;
    }

    public String displayProduct() {
        return productId + " : " + name + ", Price : " + price + "rs";
    }
}

public class Demo {

    public static void main(String[] args) {
        ArrayList<Product> basket = new ArrayList<>();
        Product p1 = new Product();
        p1.name = "Soap";
        p1.price = 40;
        basket.add(p1);

        Product p2 = new Product();
        p2.name = "Chocolate";
        p2.price = 50;
        basket.add(p2);

        Product p3 = new Product();
        p3.name = "Marker";
        p3.price = 30;
        basket.add(p3);

        for (Product prod : basket) {
            System.out.println(prod.displayProduct());
            System.out.println();
        }
    }
}