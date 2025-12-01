import java.util.ArrayList;
import java.util.Scanner;

interface Order {
    double cheese = 30;
    double seasoning = 20;

    default void prepareFood() {
        System.out.println("Order Has Been Received......");
        System.out.println("Your Order Is In Progress Please Wait......");
    }

    double getBill();

    void extraCheese();

    void seasoning();

    String getdish();
}

class Pizza implements Order {

    final int pizzaPrice = 200;
    // final String dish = "Pizza";
    int qty;
    boolean isExtraCheese = false;
    boolean isSeasoning = false;

    public Pizza(int qty) {
        this.qty = qty;
    }

    // public void prepareFood() {
    // System.out.println("Order Has Been Received......");
    // System.out.println("Your Order Is In Progress Please Wait......");
    // }

    public double getBill() {
        double bill = pizzaPrice * qty;
        if (isExtraCheese)
            bill += cheese;

        if (isSeasoning)
            bill += seasoning;

        return bill;
    }

    public void extraCheese() {
        isExtraCheese = true;
    }

    public void seasoning() {
        isSeasoning = true;
    }

    public String getdish() {
        return "Pizza";
    }

}

class Burger implements Order {

    final int burgerPrice = 100;
    int qty;
    boolean isExtraCheese = false;
    boolean isSeasoning = false;

    public Burger(int qty) {
        this.qty = qty;
    }

    // public void prepareFood() {
    // System.out.println("Order Has Been Received......");
    // System.out.println("Your Order Is In Progress Please Wait......");
    // }

    public double getBill() {
        double bill = burgerPrice * qty;

        if (isExtraCheese)
            bill += cheese;

        if (isSeasoning)
            bill += seasoning;

        return bill;
    }

    public void extraCheese() {
        isExtraCheese = true;
    }

    public void seasoning() {
        isSeasoning = true;
    }

    public String getdish() {
        return "Burger";
    }

}

class Vadapav implements Order {
    final String dish = "Vadapav";
    final int vadapavPrice = 200;
    int qty;
    boolean isExtraCheese = false;
    boolean isSeasoning = false;

    public Vadapav(int qty) {
        this.qty = qty;
    }

    // public void prepareFood() {
    // System.out.println("Order Has Been Received......");
    // System.out.println("Your Order Is In Progress Please Wait......");
    // }

    public double getBill() {
        double bill = vadapavPrice * qty;
        if (isExtraCheese)
            bill += cheese;

        if (isSeasoning)
            bill += seasoning;

        return bill;
    }

    public void extraCheese() {
        isExtraCheese = true;
    }

    public void seasoning() {
        isSeasoning = true;
    }

    public String getdish() {
        return "Vadapav";
    }
}

class Biryani implements Order {
    final String dish = "Biryani";
    final int BiryaniPrice = 200;
    int qty;
    boolean isExtraCheese = false;
    boolean isSeasoning = false;

    public Biryani(int qty) {
        this.qty = qty;
    }

    // public void prepareFood() {
    // System.out.println("Order Has Been Received......");
    // System.out.println("Your Order Is In Progress Please Wait Few
    // Minutes......");
    // }

    public double getBill() {
        double bill = BiryaniPrice * qty;

        if (isExtraCheese)
            bill += cheese;

        if (isSeasoning)
            bill += seasoning;

        return bill;
    }

    public void extraCheese() {
        isExtraCheese = true;
    }

    public void seasoning() {
        isSeasoning = true;
    }

    public String getdish() {
        return "Biryani";
    }
}

public class OMSDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = null;
        ArrayList<Order> orderList = new ArrayList<>();

        for (;;) {
            System.out.println("\n WELCOME \n");
            System.out.println();
            System.out.println("1. Burger");
            System.out.println("2. Pizza");
            System.out.println("3. Vadapav");
            System.out.println("4. Chicken Biryani");
            System.out.println("5. Extra Cheese");
            System.out.println("6. Seasoning");
            System.out.println("7. Receipt");
            System.out.println("8. Exit");
            System.out.println();
            System.out.println("Enter The option : ");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {

                case 1 -> {
                    System.out.println("How many burger you want.");
                    int qty = sc.nextInt();
                    order = new Burger(qty);
                    orderList.add(order);
                    // order.prepareFood();
                }
                case 2 -> {
                    System.out.println("How many Pizza you want.");
                    int qty = sc.nextInt();
                    order = new Pizza(qty);
                    orderList.add(order);
                }
                case 3 -> {
                    System.out.println("How many Vadapav you want.");
                    int qty = sc.nextInt();
                    order = new Vadapav(qty);
                    orderList.add(order);
                }
                case 4 -> {
                    System.out.println("How many Biryani you want.");
                    int qty = sc.nextInt();
                    order = new Biryani(qty);
                    orderList.add(order);
                }
                case 5 -> {
                    if (!orderList.isEmpty()) {
                        Order lastOrder = orderList.get(orderList.size() - 1);
                        lastOrder.extraCheese();
                        System.out.println("Extra Cheese Added");
                    } else {
                        System.out.println("You are not ordered anything");
                    }
                }
                case 6 -> {
                    // System.out.println("Seasoning");
                    if (!orderList.isEmpty()) {
                        Order lastOrder = orderList.get(orderList.size() - 1);
                        lastOrder.seasoning();
                    } else {
                        System.out.println("You are not ordered anything");
                    }
                }
                case 7 -> {
                    // System.out.println("Receipt");

                    System.out.println("**************  Receipt  **************");
                    double total = 0;
                    for(Order item : orderList){
                        System.out.println(item.getdish()+" : "+item.getBill());
                    }
                    System.out.println("Total Bill : "+);

                }
                case 8 -> {
                    System.out.println("Thank You..! Visit Again....");
                    System.exit(0);
                }

            }

        }
    }
}