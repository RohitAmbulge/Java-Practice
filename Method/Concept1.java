import java.util.*;
import java.lang.StringBuilder;

public class Concept1 {

    public static void m1(String[] args) {

        System.out.println("m1()");
        // args = new String[] { "Rohit", "Ramesh", "Ambulge" };
        args[0] = "Sonu";
        System.out.println("m1 : " + Arrays.toString(args));

    }

    public static void main(String[] args) {

        System.out.println("main()");
        System.out.println("Before method call : " + Arrays.toString(args));
        // args = new String[] { "Rohit", "Ramesh", "Ambulge" };

        // System.out.println("before method call2 : " + Arrays.toString(args));
        // args[0] = "Abhay";
        // System.out.println("Before method call : " + Arrays.toString(args));

        m1(args);
        System.out.println("After method call : " + Arrays.toString(args));

    }
}