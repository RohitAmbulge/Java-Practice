import java.util.Arrays;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int [] arr = {0, 0, 1, 1, 2, 2};

        sortArray2(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int [] arr){
        int count0 = 0, count1 = 0, count2 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0)count0++;
            else if(arr[i] == 1)count1++;
            else{
                count2++;
            }
        }

        int ind = 0;
        for(int i=0;i<count0;i++){
            arr[ind++] = 0;
        }

        for(int i=0;i<count1;i++){
            arr[ind++] = 1; 
        }

        for(int i=0;i<count2;i++){
            arr[ind++] = 2;
        }
    }

    public static void sortArray2(int [] arr){
        int low = 0, mid = 0, high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}