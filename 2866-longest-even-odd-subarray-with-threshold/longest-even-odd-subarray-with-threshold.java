class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int l=0;
        int res =0;
        int n= nums.length;
        while(l<n){
            if(nums[l]%2!=0 || nums[l]>threshold){
            l++;
            continue;
            }
            int r =l+1;
            while(r<n&& nums[r]<=threshold && nums[r]%2!=nums[r-1]%2){
                r++;
            }
            res = Math.max(res ,r-l);
         l=r;
        }
        return res;
      
    }
}