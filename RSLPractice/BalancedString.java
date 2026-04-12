import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String str = "({[)]";

        if(isBalanced(str)){
            System.out.println(str);
        }
        else{
            System.out.println(balanced(str));
        }
    }

    public static String balanced(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                sb.append(ch);
            }
            else{
               
                if(!stack.isEmpty() && isMatching(stack.peek(), ch)){
                    stack.pop();
                    sb.append(ch);
                }
            }
        }

        while(!stack.isEmpty()){
            char ch = stack.pop();

            sb.append(getClosing(ch));
        }

        return sb.toString();
    }

    public static char getClosing(char top){
        if(top == '(')return ')';
        else if(top == '{')return '}';
        else return ']';
    }

    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{

                if(stack.isEmpty())return false;

                char top = stack.pop();
                if(!isMatching(top, ch)){
                    return false;
                }
            }
        }

        return true;


    }

    public static boolean isMatching(char top, char ch){
        return (
            (top == '(' && ch == ')') || 
             (top == '[' && ch == ']') ||
              (top == '{' && ch == '}')
        );
    }
}