public class Que90{
    public static void main(String[] args){
        int bits = 3;
        int maxSet = 2;
        String x = "001";

        // if(maxSet < 1){
        //     System.out.println(x);
        // }

        System.out.println(set(x, maxSet));
    }

    public static String set(String str, int maxSet){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
           
            if(str.charAt(i) == '0' && maxSet > 0){
               sb.append('1');
                maxSet--;
            }
            else{
                sb.append('0');
            }

            
        }

        return sb.toString();
    }
}