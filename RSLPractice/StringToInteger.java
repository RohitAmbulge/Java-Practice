public class StringToInteger {
    public static void main(String[] args) {
        String s = "-1234";

        System.out.println(convert(s));
    }

    public static int convert(String str){
        int sign = 1;
        int i= 0;
        int res = 0;

        if(str.charAt(0) == '-'){
            sign = -1;
            i++;
        }

        while(i < str.length()){
            res = res * 10 + (str.charAt(i)-'0');
            i++;
        }

        return res*sign;
    }
}