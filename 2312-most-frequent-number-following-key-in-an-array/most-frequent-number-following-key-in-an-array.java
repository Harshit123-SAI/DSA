class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] freq = new int[1001];
        int ans = 0;
        int maxFreq = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1];
                freq[target]++;
                if (freq[target] > maxFreq) {
                    maxFreq = freq[target];
                    ans = target;
                }
            }
        }

        return ans;
    }
}