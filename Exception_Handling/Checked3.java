class Feature {
    public static int division(int num1, int num2) throws ArithmeticException {
        int op = num1 / num2;
        return op;
    }
}

class Demo {
    public void executeProgram() {
        int op = 0;
        try {
            op = Feature.division(10, 2);
        } catch (Exception e) {
            System.out.println("Exception Handeled");
        }

        System.out.println(op);
    }
}

public class Checked3 {

    public static void main(String[] args) {
        new Demo().executeProgram();
    }
}
