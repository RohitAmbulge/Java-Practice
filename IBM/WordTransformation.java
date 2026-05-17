public class WordTransformation {
    public static void main(String[] args) {
        String str = "cheese";

        System.out.println(transform(str));
    }

    public static String transform(String str){

        StringBuilder result = new StringBuilder();
        boolean isVowel = false;
        int temp = 0;

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(isVowel == false && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ){
                isVowel = true;
                temp = i;
            }

            if(isVowel){
                result.append(ch);
            }
        }

        result.append(str.substring(0,temp) + "ay");

        return result.toString();
    }
}