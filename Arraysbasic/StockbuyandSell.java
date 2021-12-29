class Solution {
    public int maxProfit(int[] prices) {
        int maxpro =0;
        int mintill = prices[0];
        for(int i=0;i<prices.length;i++){
            mintill = Math.min(mintill,prices[i]);
            int profit =  prices[i]-mintill;
            maxpro = Math.max(maxpro,profit);
        }
        return maxpro;
        
    }
}
