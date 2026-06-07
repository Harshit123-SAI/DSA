class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int a = prices[i];
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    a = prices[i] - prices[j];
                    break;
                }
            }
            ans[i] = a;
        }
        return ans;
    }
}