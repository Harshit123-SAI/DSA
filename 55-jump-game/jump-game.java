class Solution {
    public boolean canJump(int[] nums) {
       int m=0;
       int ans=0;
       for(int i=0;i<nums.length;i++){
         if(i > ans) return false; 
        m=nums[i]+i;
        ans= Math.max(ans,m);
       } 
       if(ans>=nums.length-1) return true;
       return false;
     
    }
}