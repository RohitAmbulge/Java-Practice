public class Que79{
    public static void main(String[] args)
    {
        int init = 5;
        int rate = 3;
        int time = 3;
        int total = init;
        int sum = 0;
        for(int i=1;i<time;i++){
            init += rate; 
            total += init;
        }

        System.out.println(total);

        System.out.println("Raohit".codePointBefore(2));
    }
}