class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n= nums.length;
        int [] ans = new int[n];
        int in=0;
        for (int i=0;i<n;i++){
            if (nums[i]<pivot)
               ans[in++]=nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) 
                ans[in++] = nums[i];
             }
        for (int i=0;i<n;i++){
            if(nums[i]>pivot)
               ans[in++]=nums[i];
        }
        return ans;
    }
}