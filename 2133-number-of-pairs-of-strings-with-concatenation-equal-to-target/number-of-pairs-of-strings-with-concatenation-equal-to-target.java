class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j]).equals(target)) count++;
                if((nums[j]+nums[i]).equals(target)) count++;
            }
        }
        return count;
    }
}