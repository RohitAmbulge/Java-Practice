public class ReverseStringWords{
    public static void main(String[] args){
        String str = "Java is easy";

        System.out.println(reverse2(str));
    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();

        String [] c = str.split(" ");
        for(int i=c.length-1;i>0;i--){
            sb.append(c[i]+" ");
        }

        sb.append(c[0]);

        return sb.toString();
    }

    public static String reverse2(String str){
        int end = str.length()-1;
        boolean firstWord = true;

        StringBuilder sb = new StringBuilder();

        while(end >= 0){

            if(end >= 0 && str.charAt(end) == ' '){
                end--;
            }

            if(end < 0)break;

            int start = end;

            while(start >= 0 && str.charAt(start) != ' '){
                start--;
            }

            if(!firstWord){
                sb.append(" ");
            }

            for(int i=start+1;i<=end;i++){
                sb.append(str.charAt(i));
            }

            firstWord = false;
            end = start-1;
        }

        return sb.toString();
    }
}