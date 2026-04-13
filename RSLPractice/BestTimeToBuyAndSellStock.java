public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int [] arr){
        int max = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }

            int profit = arr[i] - minPrice;

            if(profit > max){
                max = profit;
            }
        }

        return max;
    }
}