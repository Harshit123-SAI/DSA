class Solution {
    public int maxSubArray(int[] nums) {
        int best_end = nums[0];
        int ans = nums[0];
      for(int i=1;i<nums.length;i++){
        int v1 = best_end+nums[i];
        int v2 = nums[i];
        best_end= Math.max(v1,v2);
        ans = Math.max(ans,best_end);
      }
      return ans;
    }
}