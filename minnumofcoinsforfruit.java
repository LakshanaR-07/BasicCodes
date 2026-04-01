class Solution {
    public int minimumCoins(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = prices[i]; 
            int min = Integer.MAX_VALUE;
            for (int j = i + 1; j <= Math.min(n, i + i + 2); j++) {
                min = Math.min(min, dp[j]);
            }

            dp[i] += min;
        }

        return dp[0];
    }
}