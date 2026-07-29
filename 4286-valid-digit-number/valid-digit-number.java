class Solution {
    public boolean validDigit(int n, int x) {
        String s = n+"";
        if(s.contains(x+"")&& s.charAt(0)!=(x+'0')) return true;
        return false;
    }
}