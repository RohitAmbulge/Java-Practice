public class StringReplacement {
    public static void main(String[] args) {
         String str = "I love Java";
        String oldWord = "Java";
        String newWord = "Python";

        System.out.println(replace(str, oldWord, newWord));
    }

    public static String replace(String str, String oldWord, String newWord){

        int i =0 ;
        StringBuilder result = new StringBuilder();

        while(i < str.length()){

            if(i+oldWord.length() <= str.length() && str.substring(i,i+oldWord.length()).equals(oldWord)){
                result.append(newWord);
                i+=oldWord.length();
            }
            else{
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}