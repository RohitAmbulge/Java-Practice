import java.util.HashSet;
import java.util.Objects;
class Car{
    String name;
    String brand;
    double price;
    String color;

    public Car(){

    }

    public Car(String name, String brand, double price, String color){
        super();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String toString(){
        return "[Name : "+name+", brand : "+brand+", price : "+price+", color : "+color+"]";
    }

    public boolean equals(Object o){
        if(o != null && o instanceof Car){
            Car c = (Car)o;

            return this.name.equals(c.name) && this.brand.equals(c.brand) && this.price==c.price && this.color.equals(c.color);
        }

        return false;
    }

    public int hashCode() {
        return Objects.hash(name, brand, price, color);
    }
}
public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("Swift", "Maruti", 800000, "Red");
        Car c2 = new Car("Swift", "Maruti", 800000, "Red");
        Car c3 = new Car("City", "Honda", 1200000, "White");
        Car c4 = new Car("Sierra", "Tata", 1000000, "Yellow");
        Car c5 = new Car("Thar", "Mahindra", 1500000, "Black");
        Car c6 = new Car("Harrier", "Tata", 2500000, "White");

        HashSet<Car> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        set.add(c6);

        for(Car c : set){
            System.out.println(c);
        }

        // System.out.println(set);
    }
}