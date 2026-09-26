class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
      int l=0;
      int h=0;
      int res = Integer.MAX_VALUE;
      int sum =0;
      while(h<n){
        sum+=nums[h];
        while(sum>=target){
            int len = h-l+1;
            res = Math.min(res,len);
            sum-=nums[l];
            l++;
             
        }
        h++;
      }
      return res == Integer.MAX_VALUE ? 0 : res;
    }
}