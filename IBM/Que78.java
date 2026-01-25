public class Que78{
    public static void main(String[] args){
        String str = "alphxdida";

        int left = 0;
        int right = str.length()-1;
        int count = 0;
        while(left <= right){
            if(str.charAt(left) == str.charAt(right)){
                if(left != right){
                    count+= 2;
                }
                else{
                    count++;
                }
                
            }
            left++;
            right--;
        }

        System.out.println(count);
    }
}