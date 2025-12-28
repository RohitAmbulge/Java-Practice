public class ContainsDuplicate2 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3 };

        System.out.println(containsNearbyDuplicate(arr, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }

        return false;
    }
}