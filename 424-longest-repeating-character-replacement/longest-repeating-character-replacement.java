class Solution {
    public int characterReplacement(String s, int k) {
      int n = s.length();
      int l=0,h=0;
      int res = Integer.MIN_VALUE;
      Map<Character,Integer> mp = new HashMap<>();
      for(h=0;h<n;h++){
       char ch = s.charAt(h);
       mp.put(ch,mp.getOrDefault(ch,0)+1);
       while((h-l+1)- Collections.max(mp.values())>k){
        char left = s.charAt(l);
        mp.put(left,mp.get(left)-1);
        l++;
       
       }
      int len = h-l+1;
       res = Math.max(res,len);
      }  
      return res;

    }
}