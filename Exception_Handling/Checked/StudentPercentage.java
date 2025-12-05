class Student {
    String name;
    double per;

    Student(String name, int marks, int total) {
        this.name = name;
        this.per = calculatePer(marks, total);
    }

    public double calculatePer(int marks, int total) {
        return (marks * 100.0) / total;
    }

    public String toString() {
        return "Name : " + name + " ,Percentage : " + per + "%";
    }
}

public class StudentPercentage {

    public static void main(String[] args) {
        Student obj = null;

        try {
            obj = new Student("Ramesh", 470, 0);
        } catch (Exception e) {
            System.out.println("Something Went wrong");
        }

        System.out.println(obj);
    }
}