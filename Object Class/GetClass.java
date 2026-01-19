public class GetClass{
    public static void main(String[] args){
        Bottle b = new Bottle();
        Class<?> cl = b.getClass();
        System.out.println(cl);
    }
}

class Bottle{

}