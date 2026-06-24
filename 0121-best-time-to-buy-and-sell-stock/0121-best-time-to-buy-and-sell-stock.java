class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit=0;
        int bestbuy=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>bestbuy){
                profit=prices[i]-bestbuy;
                maxprofit=Math.max(maxprofit,profit);
            }
            bestbuy=Math.min(bestbuy,prices[i]);
        }
        return maxprofit;
        
    }
}