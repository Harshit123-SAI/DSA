class Solution {
    public int minSteps(String s, String t) {
      int[] freq = new int[26];
      for(char ch:s.toCharArray()){
        freq[ch - 'a']++;
      }  
      for(char ch:t.toCharArray()){
        freq[ch - 'a']--;
      }
      int steps = 0;
      for(int count: freq){
        if(count>0){
            steps += count;
        }
      }
      return steps;
    }
}