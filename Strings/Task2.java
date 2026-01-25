public class Task2{
    public static void main(String[] args){
        String str = "ba";
        // System.out.println(value(str.charAt(0)));
        int val = value('z');
        int res = 0;
        for(int i=0;i<str.length();i++){
            res = res * val + value(str.charAt(i));
        }

        System.out.println(res);
    }

    public static int value(char c){
        return c-96;
    }
}