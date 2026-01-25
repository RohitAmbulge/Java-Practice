public class Que77{
    public static void main(String[] args){
       
        int k = 6;
        int fact = 1;
        int count = 0;
        
        for(int i= k;i>0;i--){
            fact = fact * i;
        }

        System.out.println(fact);
        

        while(fact != 0){
            int rem = fact % 10;
            if(rem != 0){
                System.out.println(count);
                break;
            }
            else{
                count++;
               fact/= 10;
            }
        }

        System.out.println(count);
    }
}