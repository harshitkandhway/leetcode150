package org.hklearning.leetcode150.gasstation134;

public class Attempt1 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentTank = 0;
        int startIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentTank += gas[i] - cost[i];
            if (currentTank < 0) {
                startIndex = i + 1;
                currentTank = 0;
            }
        }
        return (totalGas >= totalCost) ? startIndex : -1;
    }
}
