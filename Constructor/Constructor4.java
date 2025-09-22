class Parent {
    Parent() {
        this("Rohit");
        System.out.println("parent constructor");
    }

    Parent(String str) {
        System.out.println(str);
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("child constructor");
    }
}

public class Constructor4 {
    public static void main(String[] args) {
        Child ch = new Child();
    }

}
