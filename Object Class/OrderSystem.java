import java.util.*;

class Restaurant{
    public static int id = 123;
    public static String name = "abc";
    ArrayList<Dish> menu = new ArrayList<>();

    public Restaurant(){
        super();
    }

    public void addDish(String dish, String type, int price){
        menu.add(new Dish(dish, type, price));
        System.out.println("New dish added : "+name);
    }

    public ArrayList<Dish> getMenu(){
        return menu;
    }

}

class Dish extends Restaurant{
    public String id;
    public String dish;
    public String type;
    public int price;

    {
        this.id = Restaurant.name + super.id++;
    }

    public Dish(String dish, String type, int price){
        this.dish = dish;
        this.type = type;
        this.price = price;
    }

    
    public String toString(){
        return id+" : "+dish+" : "+type+" : "+price+" rs.";
    }

}

public class OrderSystem{
    public static void main(String[] args){
        Restaurant res = new Restaurant();
        res.addDish("Biryani", "Non-veg",200);
        res.addDish("Misal","Veg",60);
        res.addDish("Fish Fry","Non-veg",150);

        for(Dish dish : res.getMenu()){
            System.out.println(dish);
        }
    }
}