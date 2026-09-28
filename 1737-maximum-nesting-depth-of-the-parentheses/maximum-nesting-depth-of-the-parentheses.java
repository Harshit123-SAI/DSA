class Solution {
    public int maxDepth(String s) {
        int max = Integer.MIN_VALUE;
        int ans=0;
        for(char x : s.toCharArray()){
            if(x=='(')
            ans++;
            else if(x==')')
            ans--;
            max = Math.max(max,ans);
        }
        return max;
    }
}