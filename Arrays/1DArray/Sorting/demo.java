import java.util.Arrays;

public class demo {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 7, 3, 8, 2, 9, 1, 0 };
        System.out.println("Before : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Before : " + Arrays.toString(arr));

    }

    public static void mergeSort(int [] arr,int l, int r){
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l , mid, r);
        }
    }

    public static void merge(int [] arr, int l, int mid, int r){
        int len1 = 
    }
}