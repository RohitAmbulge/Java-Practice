public class SecondHighest {
    public static void main(String[] args) {
        int [] nums = {2,5,7,8,0,11,3,10};

        System.out.println(second(nums));
    }

    public static int second(int [] nums){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }
            else if(num > max2 && num != max1){
                max2 = num;
            }
        }

        return max2;
    }
}