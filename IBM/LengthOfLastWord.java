public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = " Hello  Worldgfhgfj   ";

        System.out.println(wordLength2(str));

    }

    public static int wordLength2(String str){
        int i = str.length()-1;
        int count = 0;

        while(i >= 0 && str.charAt(i) ==' '){
            i--;
        }

        while(i >= 0 && str.charAt(i)!=' '){
            count++;
            i--;
        }

        return count;
    }

    public static int wordLength(String str){
        

        String[] temp = str.split("\\s");

        return temp[temp.length-1].length();
    }
}