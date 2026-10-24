class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int res = sum - k;
            int freq = mp.getOrDefault(res, 0);
            ans += freq;
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}