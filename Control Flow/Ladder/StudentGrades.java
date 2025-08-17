import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks out of 500 : ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 500) {
            System.out.println("Invalid marks " + marks + " entered");
            return;
        }

        double percentage = (marks * 100) / 500;
        String grade = "";
        System.out.println(percentage);

        if (percentage > 90 && percentage <= 100) {
            System.out.println("Outstanding!");
            grade = "O";
        } else if (percentage > 75 && percentage <= 90) {
            System.out.println("First Class with distiction!");
            grade = "A";
        } else if (percentage > 60 && percentage <= 75) {
            System.out.println("First Class!");
            grade = "B";
        } else if (percentage > 50 && percentage <= 60) {
            System.out.println("Second Class!");
            grade = "C";
        } else if (percentage > 35 && percentage <= 50) {
            System.out.println("Pass!");
            grade = "D";
        } else {
            System.out.println("Fail");
            System.out.println("Your grade is : " + 'F');
        }

    }

}
