class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i=-1,j=0;
        while(j<nums.length){
            if(nums[j]==1){
                if(i!=-1 && j-i-1<k)
                return false;
                i=j;
            }
            
            j++;
        }
        return true;
    }
    }
