interface Demo{
    public void add(int a, int b);
    // public void subtract(int a, int b);
}


public class Anonymous {
    public static void main(String[] args) {
        
        Demo d1 = new Demo(){
            public void add(int a, int b){
                System.out.println(a+b);
            }

            // public void subtract(int a, int b){
            //     System.out.println(a-b);
            // }
        };

        d1.add(4,6);
        // d1.subtract(6,8);



        System.out.println(d1.getClass().getName());


        Demo d2 = (i,j)->System.out.println(i+j); //lambda 
        d2.add(4,7);
        System.out.println(d2.getClass().getName());
    }
}