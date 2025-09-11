package concepts;

class One {
    public static void main(String[] args) {
        System.out.println("hello from main");
        m1();
        new Other().m2();
    }

    public static void m1() {
        System.out.println("m1() in one");
    }
}

class Other {

    public void m2() {
        System.out.println("m2() in other");
    }

}