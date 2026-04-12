public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1011";

        System.out.println(decimalNumber(binary));
    }

    public static int decimalNumber(String str){

        int result = 0;
        int n = str.length();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '1'){
                result += (1 << (n-i-1));
            }
            
        }

        return result;
    }
}