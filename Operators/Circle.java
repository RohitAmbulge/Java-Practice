import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final float PI = 1.347f;

        System.out.println("Enter the Radius: ");
        float radius = sc.nextFloat();

        float area = PI * (radius * radius);

        float perimeter = 2 * PI * radius;

        System.out.println("Area of the Circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);
    }

}
