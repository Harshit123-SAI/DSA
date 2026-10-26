class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int l=0;
        int h = 0;
        int ans =0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(h=0;h<n;h++){
            mp.put(nums[h],mp.getOrDefault(nums[h],0)+1);
            while(mp.get(nums[h])>k){
                int left = nums[l];
                mp.put(left,mp.get(left)-1);
                if(mp.get(left)==0){
                    mp.remove(left);
                }
                l++;
            }
            
            int len =h-l+1;
                 ans = Math.max(ans,len);
        }
        return ans;
    }
}