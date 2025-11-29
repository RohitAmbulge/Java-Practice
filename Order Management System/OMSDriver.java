import java.util.Scanner;

interface Order {
    void prepareFood();

    double getBill();

    void extraCheese();

    void seasoning();
}

class Pizza {

    final int pizzaPrice = 200;
    int qty;

    public Pizza(int qty, ) {
        this.qty = qty;
    }

    public void prepareFood() {
        System.out.println("Order Has Been Received......");
        System.out.println("Your Order Is In Progress Please Wait......");
    }

    public double getBill() {
        return pizzaPrice * qty;
    }
}

class Burger {

    final int burgerPrice = 100;
    int qty;

    public Burger(int qty) {
        this.qty = qty;
    }

    public void prepareFood() {
        System.out.println("Order Has Been Received......");
        System.out.println("Your Order Is In Progress Please Wait......");
    }

    public double getBill() {
        return burgerPrice * qty;
    }

}

class Vadapav {

}

class Biryani {
}

public class OMSDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("\n WELCOME \n");
            System.out.println();
            System.out.println("1. Burger");
            System.out.println("2. Pizza");
            System.out.println("3. Vadapav");
            System.out.println("4. Chicken Biryani");
            System.out.println("5. Extra Cheese");
            System.out.println("6. Receipt");
            System.out.println("7. Exit");
            System.out.println();
            System.out.println("Enter The option : ");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {

            }

        }
    }
}