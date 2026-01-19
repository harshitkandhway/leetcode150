package org.hklearning.leetcode150.besttimetobuystock121;

public class Attempt1 {
    public int maxProfit(int[] prices) {
        int i = 0, j=1, profit=0;
        while(j<prices.length){
            if(prices[i]>prices[j]){
                i++;
                j=i+1;
            } else{
                profit = Math.max(profit, prices[j]-prices[i]);
                j++;
            }
        }
        return profit;
    }
}
