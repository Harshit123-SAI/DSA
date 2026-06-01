import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = 0;
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            n+= cost[i];
            if (i - 1 >= 0) {
                n += cost[i - 1];
            }
        }
        return n;
    }
}