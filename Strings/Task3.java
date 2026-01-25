import java.util.Arrays;

public class Task3{
    public static void main(String[] args ){
        String str= "aabbbcdddde";
        String res = "";
        int count = 1;
        
        // char c = str.charAt(0);
        for(int i = 1;i<str.length();i++){
            char c = str.charAt(i-1);
            if(c != str.charAt(i)){
                res += c;
                res+= count;
                c = str.charAt(i);
               
                count = 1;
            }
            else{
                count++;
            }
        }

        res += str.charAt(str.length()-1);
        res += count;

        System.out.println(res);
    }
}