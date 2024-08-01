class Solution {
    public int maxProfit(int[] prices) {
        int min_index = 0;
        int max_index = 0;
        int profit = prices[max_index] - prices[min_index];
        for ( int i = 0; i < prices.length; i++){
            if (prices[min_index] > prices[i] && i != prices.length-1){
                min_index = i;
                max_index = i+1;
            }
            if (prices[max_index] < prices[i] && max_index >= min_index){
                max_index=i;
            }
            if (profit < prices[max_index] - prices[min_index]){
                profit = prices[max_index] - prices[min_index];
            }
        }
        if(profit > 0){
            return profit;
        }
        else{
            return 0;
        }
    }
}