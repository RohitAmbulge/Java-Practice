public class OddEvenBitwise{
    public static void main(String[] args){
        int num = 8;

        if(isOdd(num)){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

    public static boolean isOdd(int num){
        if((num & 1) == 1){
            return true;
        }
        else{
            return false;
        }
    }
}