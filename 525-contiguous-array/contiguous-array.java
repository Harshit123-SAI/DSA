class Solution {
    public int findMaxLength(int[] nums) {
        int zero =0;
        int one =0;
        int res =0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zero++;
                else
                one++;
                int diff= zero-one;
                if(diff==0){
                    res= Math.max(res,i+1);
                    continue;
                }
            if (!mp.containsKey(diff)) {
    mp.put(diff, i);
} else {
    int idx = mp.get(diff);
    int len = i - idx;
    res = Math.max(len, res);
}
        }
return res;
        
    }
}