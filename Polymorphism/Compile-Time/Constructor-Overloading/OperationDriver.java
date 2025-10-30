class NumberZeroException extends RuntimeException {
    NumberZeroException(String message) {
        super(message);
    }
}

class ArithmeticOper {
    int num1;
    int num2;

    ArithmeticOper(int num1, int num2) {
        this.num1 = num1;
        if (num2 == 0) {
            throw new NumberZeroException("The Number passed is zero");
        } else {
            this.num2 = num2;
        }
    }

    ArithmeticOper(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void division() {
        System.out.println("Division : " + num1 / num2);
    }
}

public class OperationDriver {

    public static void main(String[] args) {
        ArithmeticOper obj = new ArithmeticOper(10, 0);
        obj.division();
    }
}