class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int [] count = new int[26];
        for(char c:s1.toCharArray()){
            count[c-'a']++;
        }
        int l=0;
        for(int r=0;r<s2.length();r++){
           count[s2.charAt(r)-'a']--;
           if(r-l+1>s1.length()){
            count[s2.charAt(l)-'a']++;
            l++;
           } 
           if(r-l+1==s1.length()){
            boolean valid = true;
            for(int x:count){
                if(x!=0){
                valid = false;
                }
            }
            if(valid) return true;
           }
        }
        return false;
            }
}