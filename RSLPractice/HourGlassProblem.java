public class HourGlassProblem {
    public static void main(String[] args) {
        int [][] matrix = {{1, 1, 1, 0, 0},
            {0, 1, 0, 0, 0},
            {1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}};

       System.out.println(hourGlass(matrix));
    }

    public static int hourGlass(int [][] matrix){
        int max = Integer.MIN_VALUE;
        

        int n = matrix.length;
        int m = matrix[0].length;

        if(n < 3 || m <3)return -1;

        for(int i=0;i<=n-3;i++){
            
            for(int j=0;j<=m-3;j++){
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j] + 
                matrix[i+1][j+1] + matrix[i+1][j+2] + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

                if(sum > max){
                     max = sum;
                }
            }

           
        }

        return max;
    }
}