public class MethodgetClass{
    public static void main(String[] args){
        String str = new String("Hello");
        System.out.println(str);

        Object obj2 = new Student();
        Object obj3 = new Book();
        Object obj4 = new Bottle();
        
        System.out.println(obj2.getClass());
        System.out.println(obj3.getClass());
        System.out.println(obj4.getClass());
    }

    
}

class Student{}
class Book{}
class Bottle{}