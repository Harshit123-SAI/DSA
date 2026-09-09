class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       Map<Integer,Integer> mp = new HashMap<>();
       mp.put(0,-1);
       int sum =0;
       for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          int res = sum%k;
       
       if(mp.containsKey(res)){
        if(i-mp.get(res)>=2)
        return true;
       }else{
       mp.put(res,i);
       }
       }
       return false;
    }
}