import java.util.HashMap;

public class FirstNonRepeatingChar{

    public static void main(String[] args){
        String str = "swiss";

        System.out.println(repeatingEle(str));
    } 

    public static char repeatingEle(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        for(char c : str.toCharArray()){
            if(map.get(c) == 1){
                return c;
            }
        }

        return 0;
    }
}