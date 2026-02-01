import java.util.Arrays;

public class StringCompression{
    public static void main(String [] args){
        String str = "a3b5c2a2";
        compression(str);
    }

    public static void compression(String str){

        int [] freq = new int[26];

       for(int i=0;i<str.length();){
            char ch = str.charAt(i);
            int ind = ch - 'a';

            if(Character.isLetter(ch)){
                i++;

                int count = 0;
                while(i < str.length() && Character.isDigit(str.charAt(i))){
                    count = count * 10 + (str.charAt(i)-'0');
                    i++;
                }

                freq[ind++] += count;
            }
            else{
                i++;
            }


        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0){
                sb.append((char)(i+'a')).append(freq[i]);
            }
            
        }
        System.out.println(Arrays.toString(freq));
        System.out.println(sb.toString());

        // return freq
    }
}