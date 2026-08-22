class Solution {
    public int minimumDistance(int[] nums) {
      int n= Integer.MAX_VALUE;
      if(nums.length<3) return  -1;
       for (int i=0;i<nums.length;i++){
        for(int j =i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if (nums[i]==nums[j] && nums[j]==nums[k] && nums[k]==nums[i]){
                    int x= Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                     n = Math.min(n, x);
                }
            }
        }

       }
       if (n == Integer.MAX_VALUE) {
            return -1;
        }

        return n;
    }
}