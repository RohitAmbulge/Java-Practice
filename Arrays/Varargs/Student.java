import java.util.Arrays;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Enter contact : ");
        long contact = sc.nextLong();

        // System.out.println("Enter marks for sub1 : ");
        // double sub1 = sc.nextLong();
        // System.out.println("Enter marks for sub1 : ");
        // double sub2 = sc.nextLong();
        // System.out.println("Enter marks for sub1 : ");
        // double sub3 = ;
        // System.out.println("Enter marks for sub1 : ");
        // double sub4 = sc.nextLong();
        // System.out.println("Enter marks for sub1 : ");
        // double sub5 = sc.nextLong();
        // String name = "Rohit";
        // long contact = ;

        calculate("Rohit", 1234567890l, sc.nextLong(),sc.nextLong(),sc.nextLong(),sc.nextLong());
        // calculate("Ankit", 34567890123l, 79, 90, 65);
    }

    public static void calculate(String name, long contact, double... marks) {
        System.out.println(Arrays.toString(marks));

        double total = 0;
        for (double mark : marks) {
            total += mark;
        }

        double per = total / marks.length;
        System.out.println(total);
        System.out.println(per);

        System.out.println();

    }
}