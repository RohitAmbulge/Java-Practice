public class AdditionOfWrapperEle {

    public static void main(String[] args) {
        int op = addition(args[0], args[1]);
        System.out.println(op);

        
    }

    public static int addition(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return n1 + n2;
    }
}