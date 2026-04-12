public class MaxOddBinary {
    public static void main(String[] args) {
        String str = "011";

        System.out.println(maxOdd(str));
    }

    public static String maxOdd(String str){
        int count1 = 0, count0 = 0;
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '1')count1++;
            else count0++;
        }

        if(count1 == 0) return "";

        for(int i=1;i<=count1-1;i++){
            sb.append('1');
        }

        for(int i=1;i<=count0;i++){
            sb.append('0');
        }

        sb.append('1');

        return sb.toString();

    }
}