public class CheckCyclicString {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        System.out.println(isCyclic(str1, str2));
    }

    public static boolean isCyclic(String str1 , String str2){
        if(str1.length() != str2.length())return false;

        String str = str1+str1;

        return str.contains(str2);
    }
}