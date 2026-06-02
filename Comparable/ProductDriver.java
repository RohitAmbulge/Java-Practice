import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>{
    String name;
    int quantity;
    double price;

    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString(){
        return "{"+name+", Qty "+quantity+" , Price : $"+price+"}";
    }

    public int compareTo(Product other){
        // return this.name.compareTo(other.name);
        // return Double.compare(this.price,other.price);
        return Integer.compare(this.quantity,other.quantity);
    }
}

public class ProductDriver{
    public static void main(String[] args){
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Soap",2,80));
        list.add(new Product("Rice",1,60));
        list.add(new Product("Pen",6,90));
        list.add(new Product("Bag",1,300));
        list.add(new Product("Bottle",2,220));
        
        Collections.sort(list);
        
        for(Product p : list){
            System.out.println(p);
        }
    }
}