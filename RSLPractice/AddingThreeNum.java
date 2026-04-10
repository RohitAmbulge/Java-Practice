public class AddingThreeNum {
    public static void main(String[] args) {
        int num = 483;

        System.out.println(addNum(num));
    }

    public static int addNum(int num){
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }

    // public static int addNum(int num){

    //     int sum = 0;

    //     while(num != 0){
    //         int digit = num% 10;
    //         sum += digit;
    //         num /= 10;
    //     }

    //     return sum;
    // }
}