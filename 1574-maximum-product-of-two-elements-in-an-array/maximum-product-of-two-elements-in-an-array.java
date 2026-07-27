class Solution {
    public int maxProduct(int[] nums) {
        int mx =Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                mx = Math.max(mx,(nums[i]-1)*(nums[j]-1));
            }
        }
        return mx;
    }
}