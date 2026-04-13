public class CheckCyclicString {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        System.out.println(isCyclic2(str1, str2));
    }

    public static boolean isCyclic(String str1 , String str2){
        if(str1.length() != str2.length())return false;

        String str = str1+str1;

        return str.contains(str2);
    }

    public static boolean isCyclic2(String str1, String str2){
        if(str1.length() != str2.length())return false;

        int n = str2.length();
        String str = str1+str1;

        for(int i=0;i<=str.length()-n;i++){
            boolean ismatch = true;
            for(int j=0;j<str2.length();j++){
                if(str.charAt(i+j) != str2.charAt(j)){
                    ismatch = false;
                    break;
                }
            }

            if(ismatch)return true;
        }

        return false;
    }
}