import java.util.*;

public class TripletProgram {
    public static void main(String[] args) {
        int [] arr = {4,6,8};

        triplet2(arr);
    }

    public static void triplet(int [] arr){

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                if(i == j)continue;

                int k = arr[j] * 2 - arr[i];

                if(set.contains(k)){
                    System.out.println(arr[i] +" "+arr[j] +" "+k);
                }
            }
        }
    }

    public static void triplet2(int [] arr){

        for(int j=1;j<arr.length-1;j++){

            int i = j-1;
            int k = j+1;

            while(i >= 0 && k<arr.length){
                int target = 2 * arr[j];

                int sum = arr[i] + arr[k];

                if(target == sum){
                    System.out.println(arr[j] +" "+arr[i]+" "+arr[k]);
                    i--;
                    k++;
                }
                else if(sum < target){
                    k++;
                }
                else{
                    i--;
                }
            }
        }
    }
}