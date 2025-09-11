import java.util.ArrayList;
import java.util.Scanner;

class Student {
    static int uniqueId = 001;
    String sid;
    String name;
    String email;
    String education;
    int yop;

    {
        if (uniqueId < 10) {
            sid = "2021BIT00" + uniqueId++;
        } else if (uniqueId < 100) {
            sid = "2021BIT0" + uniqueId++;
        } else {
            sid = "2021BIT" + uniqueId++;
        }

    }

    Student(String name, String email, String education, int yop) {

        this.name = name;
        this.email = email;
        this.education = education;
        this.yop = yop;
    }

    public void displayInfo() {
        System.out.printf("Id:%s, Name:%s,  Email:%s,  Education:%s, YOP:%d%n", sid, name, email, education, yop);
    }
}

public class StudentInfo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int noOfStudent = sc.nextInt();
        System.out.println();
        System.out.println("*********");
        System.out.println();

        for (int i = 1; i <= noOfStudent; i++) {

            System.out.println("Enter the info of " + i + " Student");
            System.out.println("Enter the name : ");
            String name = sc.next();

            System.out.println("Enter Email : ");
            String email = sc.next();

            System.out.println("Enter Education : ");
            String education = sc.next();

            System.out.println("Enter year of passout : ");
            int yop = sc.nextInt();

            list.add(new Student(name, email, education, yop));

            System.out.println();

        }

        System.out.println("*******************");
        System.out.println();

        for (Student ele : list) {
            System.out.println();
            ele.displayInfo();
        }
    }

}
