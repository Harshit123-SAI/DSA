class Solution {
    public List<Integer> findLonely(int[] nums) {
      HashMap<Integer,Integer> freq = new HashMap<>();
      for (int x:nums){
        freq.put(x, freq.getOrDefault(x,0)+1);
      }  
      List<Integer> ans = new ArrayList<>();
      for(int x:nums){
        if(freq.get(x)==1 && !freq.containsKey(x-1) && !freq.containsKey(x+1)){
            ans.add(x);
        }
      }
      return ans;
    }
}