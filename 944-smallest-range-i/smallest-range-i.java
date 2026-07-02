class Solution {
    public int smallestRangeI(int[] nums, int k) {
      int a=Integer.MAX_VALUE;
      int b=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        b=Math.max(b,nums[i]);
        a=Math.min(a,nums[i]);
        }
        return Math.max(0,b-a-2*k);  
    }
}