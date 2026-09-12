class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
     int [] ans  = new int[n];
      int l=0;
      int r = n-1;
      int k=n-1;
      while(l<=r){
        if(Math.abs(nums[l])<=Math.abs(nums[r])){
            ans[k--] = nums[r]*nums[r];
            r--;
        }
        else{
         ans[k--] = nums[l]*nums[l];
            l++;
        }
        
      } 
      return ans;
    }
}