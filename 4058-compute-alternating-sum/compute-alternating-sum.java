class Solution {
    public int alternatingSum(int[] nums) {
         int c=0,d=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) c+=nums[i];
            else d+=nums[i];
        }
        return c-d;
    }
    }
