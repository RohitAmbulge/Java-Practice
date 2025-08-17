import java.util.Scanner;

public class PayOfEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary of the employee : ");
        double salary = sc.nextDouble();
        double tempSalary = salary;

        System.out.println("Enter the target score of the employee : ");
        double targetScore = sc.nextDouble();

        if (targetScore < 0 || targetScore > 100) {
            System.out.println("Invalid target score!");
            return;
        }

        if (targetScore > 90) {
            salary = salary + (salary * 0.03);
        } else {
            salary = salary + (salary * 0.01);
        }

        System.out.println("Employee initial salary is : " + tempSalary);

        System.out.println("Employee salary is increases to : " + salary);

    }

}
