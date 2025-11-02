class Animal {
    public void sound() {
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meows");
    }
}

public class Example1 {

    public static void main(String[] args) {
        Animal obj1 = new Dog();
        obj1.sound();

        Animal obj2 = new Cat();
        obj2.sound();
    }
}