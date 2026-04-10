public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 10;

        System.out.println(convert(num));
    }

    public static String convert(int num){

        if(num == 0)return "0";
       int [] temp = new int[32];
        StringBuilder result = new StringBuilder();

       int ind = 0;

       while(num != 0){
            int rem = num % 2;
            temp[ind++] = rem;
            num /= 2;
       }

       for(int i = ind-1;i>=0;i--){
            result.append(temp[i]);
       }

       return result.toString();
    }
}