class Solution {
    public int minOperations(String s) {
        int c = 0;
        for(int x:s.toCharArray()){
        if(x!='a')
        c=Math.max(c,26-(x-'a'));
        }return c;
    }
}