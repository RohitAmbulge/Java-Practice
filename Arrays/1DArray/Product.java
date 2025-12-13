public class Product {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7, 8 };
        int prod = 1;

        for (int i : arr) {
            prod *= i;
        }

        System.out.println("Product : " + prod);
    }
}