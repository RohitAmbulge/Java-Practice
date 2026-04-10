public class ReplaceWithgivenChar {
    public static void main(String[] args) {
        String str = "I want to work for Raja Software Labs";

        System.out.println(replace(str));
    }

    public static String replace(String str){

       StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                sb.append('%');
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}