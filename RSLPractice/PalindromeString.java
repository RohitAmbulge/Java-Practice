public class PalindromeString {
    public static void main(String[] args) {
        String str = "Naman";

        System.out.println(isPalindrome(str));

        System.out.println("rohit".equalsIgnoreCase("Rohit"));
    }

    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int l = 0;
        int r = str.length()-1;

        while(l <= r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}