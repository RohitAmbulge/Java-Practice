public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int [] arr = {1, 1, 0, 1, 1, 1};

        System.out.println(maxConsecutive(arr));
    }

    public static int maxConsecutive(int [] arr){
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }

        return count;
    }
}