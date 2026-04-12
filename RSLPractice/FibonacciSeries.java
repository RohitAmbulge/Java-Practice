public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 13;
        for(int i=0;i<num;i++){
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int num){
        if(num == 0 || num == 1){
            return num;
        }

        return  fibonacci(num-1) + fibonacci(num-2);
       
    
    }
}