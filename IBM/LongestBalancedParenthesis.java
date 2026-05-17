public class LongestBalancedParenthesis {
    public static void main(String[] args) {
        String str = "(()())";

        System.out.println(longest(str));
    }

    public static int longest(String str){
        int open = 0;
        int balancedCount = 0;

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch == '('){
                open++;
            }
            else{
                if(open > 0){
                    balancedCount+=2;
                    open--;
                }
            }
        }

        return balancedCount;
    }
}