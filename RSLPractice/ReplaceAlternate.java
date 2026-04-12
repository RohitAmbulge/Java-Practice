import java.util.Arrays;

public class ReplaceAlternate {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        // System.out.println(Arrays.toString(replace(str)));

        System.out.println(replace2(str));
    }

    public static String replace2(String str){
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int wordCount = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '.'){
                if(wordCount % 2== 0){
                    result.append(temp);
                }
                else{
                    result.append("abc");
                }

                result.append('.');
                wordCount++;
                temp.setLength(0);
            }
            else{
                temp.append(ch);
            }
        }

        if(wordCount % 2 == 0){
            result.append(temp);
        }
        else{
            result.append("abc");
        }

        return result.toString();
    }

    public static String[] replace(String str){
        String [] words = str.split("\\.");
        
        for(int i=0;i<words.length;i++){
            if(i % 2 == 1){
                words[i] = "abc";
            }
        }

    
        return words;
    }
}