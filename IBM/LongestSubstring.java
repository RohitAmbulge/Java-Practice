import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "cadbzabcd";

        System.out.println(length2(str));
    }

    public static int length(String str ){

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;

        for(int i=0;i<str.length();i++){
            int count = 0;

            for(int j = i;j<str.length();j++){

                char ch = str.charAt(j);

                if(set.add(ch)){
                    count++;
                }
                else{
                    break;
                }
            }

            maxLength = Math.max(count, maxLength);
        }

        return maxLength;
    }

    public static int length2(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int left = 0;

        for(int right=0;right<str.length();right++){

            char ch = str.charAt(right);
            
            if(map.containsKey(ch)){
                maxLength = Math.max(maxLength, ((right-1)-left+1));
                left = Math.max(left, map.get(ch) + 1);
                map.put(ch, right);
            }
            
            map.put(ch, right);
           
        }

        return maxLength;
    }
}