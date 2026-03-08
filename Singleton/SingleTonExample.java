public class SingleTonExample {
    private static SingleTonExample obj;

    private SingleTonExample(){
        System.out.println("Object is created");
    }

    public static SingleTonExample getObject(){
        if(obj == null){
            obj = new SingleTonExample();
        }

        return obj;
    }

    public static void main(String[] args) {
        SingleTonExample obj = SingleTonExample.getObject();
        System.out.println(obj);

        SingleTonExample obj2 = SingleTonExample.getObject();
        System.out.println(obj2);
    }
}