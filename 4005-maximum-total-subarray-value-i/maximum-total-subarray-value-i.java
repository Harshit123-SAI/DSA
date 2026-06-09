class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n= nums.length;
        long l=nums[0];
      long r=nums[0];
        for (int i=0;i<n;i++){
            l=Math.max(l,nums[i]);
            r=Math.min(r,nums[i]);
        }
        return k*(l-r);
    }
}