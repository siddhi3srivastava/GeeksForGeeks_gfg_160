/*Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.*/

class Solution {
    public int maximumProfit(int prices[]) {
    
        int maxProfit=0;
        int n=prices.length;
        int minCost=prices[0];
        
        if(n==0||n==1){
            return 0;
        }
        for(int i=0; i<n; i++){
            if(prices[i]<minCost){
                minCost=prices[i];
            }
            else{
                int profit=prices[i]-minCost;
                maxProfit=Math.max(maxProfit, profit);
            }
        }
        
        return maxProfit;
    }
}
