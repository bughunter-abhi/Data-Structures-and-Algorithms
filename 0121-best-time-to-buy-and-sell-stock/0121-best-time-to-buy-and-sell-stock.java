class Solution {
    public int maxProfit(int[] prices) {
        int BuyStock = prices[0];
        int MaxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(BuyStock > prices[i]){
                BuyStock = prices[i];
            }
            else if((prices[i] - BuyStock) > MaxProfit){
                MaxProfit = prices[i] - BuyStock;
            }
        }
        return MaxProfit;
    }
}