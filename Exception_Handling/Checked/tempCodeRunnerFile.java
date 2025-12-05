class Student {
    String name;
    String id;

    Student(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return id + " : " + name;
    }

    @Override
    @SuppressWarnings("removal")
    public void finalize() {
        System.out.println("Finalize Start");
        // System.out.println(10 / 0);
        System.out.println("Object Removed From heap");
    }

}

public class StudentExample {

    public static void main(String[] args) {
        System.out.println("Execution Start");
        Student obj = new Student("Rohit", "STD123");
        System.out.println(obj);
        obj = null;
        System.gc();
        System.out.println("Execution Ends");
    }
}