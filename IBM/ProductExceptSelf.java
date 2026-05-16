import java.util.*;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(Arrays.toString(product(nums)));
       
    }

    public static int[] product(int [] nums){
        int [] result = new int[nums.length];
       

        for(int i=0;i<nums.length;i++){
             int prod = 1;
            for(int j=0;j<nums.length;j++){
               if(i != j){
                    prod *= nums[j];
               }
            }

            result[i] = prod;
        }

        return result;
    }


}