public class ReverseStringExceptSpace {
    public static void main(String[] args) {
        String str = "I_LOVE_INDIA";

        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            if(ch != '_'){
                sb.append(ch);
            }
            
        }

        int j = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '_'){
                result.append('_');
            }
            else{
                result.append(sb.charAt(j++));
            }
        }

        return result.toString();
    }
}