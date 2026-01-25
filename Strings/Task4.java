import java.util.Arrays;

public class Task4{
    public static void main(String[] args ){
        // String str = "a2b3c4";
        // String res = "";
        // char temp = 0;
        // int count = 0;


        // for(int i=0;i<str.length();i++){
        //     if(i % 2 == 0){
        //         temp = str.charAt(i);
        //         res += temp;
        //         count = str.charAt(i+1)-'0';
        //     }
        //     else{
        //         for(int j = 1;j<count;j++){
        //             res += temp;
        //         }
        //     }
        // }

        // System.out.println(res);

        int count = 0;
        String res = "";
        char temp = 0;

        for(int i=0;i<str.length();i++){
            
            char c = str.charAt(i);
            if(c >= 97 && c <= 122){
                temp = c;
                
            }
            else{
                count = count * 10 + (c-'0');
            }

            
        }
    }
}