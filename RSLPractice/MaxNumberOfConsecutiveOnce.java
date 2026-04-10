public class MaxNumberOfConsecutiveOnce{
    public static void main(String[] args){
        int [] arr = {1, 1, 0, 1, 1, 1};

        System.out.println(maxOnce(arr));
    }

    public static int maxOnce(int [] arr){
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }
            else{
                
                count= 0;
            }
        }

        return max;
    }
}