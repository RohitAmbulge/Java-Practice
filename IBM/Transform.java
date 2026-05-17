public class Transform {
    public static void main(String[] args) {
        String str = "education";

        System.out.println(replace(str));
    }

    public static String replace(String str){

        StringBuilder result = new StringBuilder();
        int count = 9;

        for(int i = str.length()-1;i>= 0;i--){
            char ch = str.charAt(i);
            if(isVoewl(ch)){
                result.append(count);
                count--;
            }
            else{
                result.append(ch);
            }

            if(count == 0){
                count = 9;
            }
        }

        return result.toString();
    }

    public static boolean isVoewl(char ch){

        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            return true;
        }

        return false;
    }
}