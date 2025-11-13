interface shapeCalculator {
    double PI = 22.0 / 7.0;

    public abstract void areaOfCircle(double r);

    public void perimeterOfCircle(double r);

    abstract void areaOfSquare(double side);

    void perimeterOfSquare(double side);

    void areaOfTriangle(double height, double base);

    public static void message(String name) {
        System.out.println("Hi i am " + name);
    }

}

class CalculatorImpl implements shapeCalculator {
    public void areaOfCircle(double r) {
        System.out.println(PI * r * r);
    }

    public void areaOfSquare(double side) {
        System.out.println(side * side);
        // shapeCalculator.message("rohit");
    }

    public void perimeterOfCircle(double r) {
        System.out.println(2 * PI * r);
    }

    public void perimeterOfSquare(double side) {
        System.out.println(4 * side);
    }

    public void areaOfTriangle(double height, double base) {
        System.out.println(0.5 * base * height);
    }

    // public static void message(String name){
    // System.out.println("hello");
    // }
}

public class ShapeCalculatorDriver {

    public static void main(String[] args) {
        shapeCalculator obj = new CalculatorImpl();
        obj.areaOfCircle(4);
        obj.message("rohit");
    }
}