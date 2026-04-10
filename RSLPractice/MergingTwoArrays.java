import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
        int [] nums1 = {2,5,7,9,20};
        int [] nums2 = {1,3,4,10,14,17};

        System.out.println(Arrays.toString(mergeArrays(nums1, nums2)));
    }

    public static int[] mergeArrays(int [] nums1, int [] nums2){
        int l1 = nums1.length;
        int l2 = nums2.length;

        int [] ans = new int[l1+l2];
        int i= 0, j = 0, k = 0;

        while(i < l1 && j < l2){
            if(nums1[i] <= nums2[j]){
                ans[k++] = nums1[i++];
            }
            else{
                ans[k++] = nums2[j++];
            }
        }

        while( i < l1 ){
            ans[k++] = nums1[i++];
        }

        while(j < l2){
            ans[k++] = nums2[j++];
        }

        return ans;
    }
}