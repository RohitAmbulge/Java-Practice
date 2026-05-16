import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        

        System.out.println(Arrays.deepToString(rotate(matrix)));
    }

    public static int[][] rotate(int[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            int l = 0;
            int r = arr[i].length-1;
            while(l < r){
                int temp  = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;

                l++;
                r--;
            }
        }

        return arr;
    
    }
}