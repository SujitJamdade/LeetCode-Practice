class Solution {
    public int maxProfit(int[] prices) {
        
        int buy = Integer.MAX_VALUE;
        int MaxProfit = 0;
        
        for(int i = 0;i<prices.length;i++){
            
            if(buy < prices[i]){
                int profit = prices[i] - buy;
                MaxProfit = Math.max(profit, MaxProfit);
            }
            else{
                buy = prices[i];
            }
        }
        
        return MaxProfit;
    }
}