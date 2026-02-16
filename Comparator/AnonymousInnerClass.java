interface Add{
    int add(int a, int b);
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Add obj = new Add(){
        //     public void add(int a, int b){
        //         System.out.println(a+b);
        //     }
        // };

        // obj.add(6,7);

        Add obj = (a,b)->a+b;

        System.out.println(obj.add(2,4));
        ;
    }
}