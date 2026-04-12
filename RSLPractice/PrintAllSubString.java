import java.util.HashSet;

public class PrintAllSubString {
    public static void main(String[] args) {
        String str = "aba";

       System.out.println( longestSubString(str));;

    }


    public static void subString(String str){
       
        for(int i=0;i<str.length();i++){
            HashSet<Character> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<str.length();j++){

                char c = str.charAt(j);
                if(set.contains(c)){
                    break;
                }

                set.add(c);
                sb.append(c);
                System.out.println(sb.toString());
            }
        }
    }


     public static int longestSubString(String str){
        int max = 0;

        for(int i=0;i<str.length();i++){
            HashSet<Character> set = new HashSet<>();
           
            for(int j=i;j<str.length();j++){

                char c = str.charAt(j);
                if(set.contains(c)){
                    
                    break;
                }

                set.add(c);

                if(set.size() > max){
                    max = set.size();
                }
                // sb.append(c);
                // System.out.println(sb.toString());
            }
        }

        return max;
    }
}