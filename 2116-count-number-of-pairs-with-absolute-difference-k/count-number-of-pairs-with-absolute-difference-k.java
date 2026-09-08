class Solution {
    public int countKDifference(int[] nums, int K) {
        Map<Integer,Integer> mp = new HashMap<>();
        int c=0;
        for(int x:nums){
            if(mp.containsKey(x-K)){
                c+= mp.get(x-K);
            }
            if(mp.containsKey(x+K)){
                c+= mp.get(x+K);
            }
            mp.put(x, mp.getOrDefault(x,0)+1);
        }
        return c;
    }
}