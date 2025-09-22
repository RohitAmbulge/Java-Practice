class Demo {
    int a = 10;

    {
        System.out.println("Non-static block");
        System.out.println(a);
    }
}

public class Constructor6 {
    public static void main(String[] args) {
        new Demo();
    }
}
