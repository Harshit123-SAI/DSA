class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            int lS= 0;
        int rS = 0;
            for (int j=0;j<i;j++){
                lS+=nums[j];
            }
            for(int j=i+1;j<n;j++){
                rS+=nums[j];
            }
            ans[i] = Math.abs(lS-rS);
        }
       return ans;
    }
}