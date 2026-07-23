class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
       int res= 0; 
       for (int i=0;i<nums.length; i++){
        while(nums[i]>0){
        if (nums[i]%10==digit){
            res++;
        }
        nums[i]/=10;
       }
       }
       return res;
    }
}