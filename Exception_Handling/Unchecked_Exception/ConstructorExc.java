class Student {
    String name;
    double per;

    Student(String name, int marks) throws Exception {
        this.name = name;
        this.per = (marks / 0) * 100;
    }

    public String toString() {
        return "Name : " + name + " , Percentage :" + per + "%";
    }
}

public class ConstructorExc {

    public static void main(String[] args) {
        Student obj = null;
        try {
            obj = new Student("Ramesh Kumar", 450);
        } catch (Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println(obj);
    }
}