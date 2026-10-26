class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l=0;
        int h=0;
        int ans = 0;
        int sum=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(h=0;h<n;h++){
            mp.put(nums[h],mp.getOrDefault(nums[h],0)+1);
            sum+=nums[h];
            while(mp.get(nums[h])>1){
                int left = nums[l];
                mp.put(left,mp.get(left)-1);
                sum-=nums[l];
                if(mp.get(left)==0){
                    mp.remove(left);
                }
                l++;
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}