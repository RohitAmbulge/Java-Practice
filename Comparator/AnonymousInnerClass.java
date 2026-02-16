interface Add{
    void add(int a, int b);
    void subtract(int a, int b);
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Add obj = new Add(){
            public void add(int a, int b){
                System.out.println(a+b);
            }

            public void subtract(int a, int b){
                System.out.println(a-b);
            }
        };

        obj.add(6,7);
        obj.subtract(5,3);

        
    }
}