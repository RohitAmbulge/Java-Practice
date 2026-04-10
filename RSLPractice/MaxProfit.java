public class MaxProfit{
    public static void main(String[] args){
            int [] prices = {4,7,1,5,6,3};

            System.out.println(profit(prices));
    }


    public static int profit(int [] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            // maxProfit = prices[i] - minPrice;

            if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}