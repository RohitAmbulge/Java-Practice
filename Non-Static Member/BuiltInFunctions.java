public class BuiltInFunctions {

    public static void main(String[] args) {

        UserMath obj = new UserMath();

        // power
        System.out.println(Math.pow(3, 5)); // built-in
        System.out.println("Power is : " + obj.pow(2.5, 6)); // user-defined

        // Absolute
        System.out.println(Math.abs(-668.579868)); // built-in
        System.out.println("Absolute value is : " + obj.abs(-474)); // user-defined

        // Minimum
        System.out.println(Math.min(2.345, 7.4365)); // built-in
        System.out.println("minimum value is : " + obj.min(3, 6)); // user-defined

        // maximum
        System.out.println(Math.max(-5466, -578)); // built-in
        System.out.println("maximum value is : " + obj.max(3, 6)); // user-defined

    }
}

class UserMath {

    // Power
    public double pow(double num, int power) {
        double op = 1;

        for (int i = 1; i <= power; i++) {
            op *= num;
        }

        return op;
    }

    // Absolute value
    public double abs(double num) {
        if (num < 0) {
            num = -num;
        }

        return num;
    }

    // minimum
    public double min(double a, double b) {

        if (a < b) {
            return a;
        }

        return b;
    }

    // maximum
    public double max(double a, double b) {

        if (a > b) {
            return a;
        }

        return b;
    }

}