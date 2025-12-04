class Student {
    String name = "Ramesh Kumar";
    String add = "Pune";
    char ch;
}

public class StudentDriver {

    static Student obj;

    public static void main(String[] args) {
        System.out.println(obj.name);
        System.out.println(obj.add);
    }
}