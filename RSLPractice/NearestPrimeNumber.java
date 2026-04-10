public class NearestPrimeNumber{
    public static void main(String[] args){
        int num = 23;

        System.out.println(nearestNumber(num));
    }

    public static int nearestNumber(int num){

        if(isPrime(num))return num;

        int lower = num - 1;
        int higher = num+1;

        while(true){
            if(lower >= 2 && isPrime(lower)){
                return lower;
            }

            if(isPrime(higher)){
                return higher;
            }

            lower--;
            higher++;
        }
    }

    public static boolean isPrime(int num){
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    } 
}