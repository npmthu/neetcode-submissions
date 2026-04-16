class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int max = 0;

        while(sell < prices.length){
            if(prices[buy] < prices[sell]){
                int prof = prices[sell] - prices[buy];
                max = Math.max(max, prof);
            }
            else{
                buy = sell;
            }
            sell++;
        }

        return max;
    }
}
