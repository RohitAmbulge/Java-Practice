import java.util.Arrays;

public class Que85{
    public static void main(String[] args){
        int n = 5;
        int [] arr = {100, 200, 150 , 120,80};
        double first = 10;
        double second = 5, third = 3;

        for(int i=0;i<n;i++){
            double price = arr[i]+(arr[i]*(first/100));

            int updatePr = (int)price;
            // System.out.println(price);
            if(updatePr % 2 == 0){
                price = updatePr - (updatePr*second/100);
            }
            else{
                price = updatePr - (updatePr*third/100);
            }

            arr[i] = (int)price;
        }

        System.out.println(Arrays.toString(arr));
    }
}