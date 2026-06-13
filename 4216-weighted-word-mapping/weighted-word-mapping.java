class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
         StringBuilder ans = new StringBuilder();
         for(String x:words){
            int sum = 0;
            for(char ch:x.toCharArray()){
                sum = (sum+weights[ch-'a'])%26;
            }
            ans.append((char)('a' + (25 - sum)));
         }
         return ans.toString();
    }
}