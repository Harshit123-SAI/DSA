class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        double m = Double.MAX_VALUE;
        while (l < r) {
            m = Math.min(m, (nums[l] + nums[r]) / 2.0);
            l++;
            r--;
        }
        return m;
    }
}