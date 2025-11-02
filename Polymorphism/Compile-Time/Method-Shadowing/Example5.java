class Ganesh {
    String str = "Parent Class";

    public static void carrier() {
        System.out.println("Software Engineer");
    }
}

class Mahesh extends Ganesh {
    String str = "Child Class (Mahesh)";

    public static void carrier() {
        System.out.println("Acting");
    }
}

public class Example5 {

    public static void main(String[] args) {
        Ganesh obj = new Mahesh();
        obj.carrier();

        Mahesh obj1 = (Mahesh) obj;
        obj1.carrier();
    }
}