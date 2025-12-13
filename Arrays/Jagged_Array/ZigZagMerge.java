import java.util.Arrays;

class ZigZagMerge {

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40 ,2,5};
        int m = arr1.length;

        int[] arr2 = { 50, 60, 70 };
        int n = arr2.length;

        int[] newArr = new int[arr1.length + arr2.length];

        int j = 0;
        int k = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (j < m && i % 2 == 0) {
                newArr[i] = arr1[j++];
            }
            else if (k < n && i % 2 != 0) {
                newArr[i] = arr2[k++];
            }
           

        }

        

        System.out.println(Arrays.toString(newArr));
    }
}