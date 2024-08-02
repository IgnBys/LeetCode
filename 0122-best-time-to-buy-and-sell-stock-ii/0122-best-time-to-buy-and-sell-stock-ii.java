class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int maximum =0;
        for(int day = 1; day < prices.length; day++){
            if (buy >prices[day]){
                buy = prices[day];
            }
            else if(prices[day] - buy >= maximum ){
                maximum = prices[day] - buy;
                if (day >= prices.length-1){
                    profit+=maximum;
                    return profit;
                }
                else if  (prices[day+1] < prices[day]){
                    profit += maximum;
                    buy = prices[day+1];
                    maximum = 0;
                }
            }
        }
        return profit;
    }
}