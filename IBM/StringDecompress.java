public class StringDecompress {
    public static void main(String[] args) {
          String s = "a13b2c10";

          System.out.println(decompress(s));
    }

    public static String decompress(String str){

        StringBuilder result = new StringBuilder();
        
        int i = 0;

        while(i < str.length()){
            int freq = 0;
            char ch = str.charAt(i);
            i++;

            while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
               freq = freq * 10 + (int)(str.charAt(i) - '0');
               i++;
            }

            for(int j = 1;j<= freq;j++){
                result.append(ch);
            }
        }

        return result.toString();
    }
}