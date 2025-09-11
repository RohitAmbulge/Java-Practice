class Student {
    static int unique;
    String stdId;
    String name;

    static {
        unique = 1234;
    }

    {
        stdId = "stud" + unique++;
    }

    Student(String name) {
        this.name = name;
    }

    public void displayStudent() {
        System.out.println(stdId + " : " + name);
    }
}

public class StudentDriver {

    public static void main(String[] args) {

        Student obj1 = new Student("Rohit");
        obj1.displayStudent();

        Student obj2 = new Student("Abhay");
        obj2.displayStudent();
    }
}