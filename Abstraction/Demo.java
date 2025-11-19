abstract class Parent {
    int addition(int num1, int num2) {
        return num1 + num2;
    }
}

class Child extends Parent {
    @Override
    public int addition(int num1, int num2) {
        int op = num1 - num2;
        return op;
    }
}

public class Demo {

    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.addition(10, 20));
        // ;
    }
}