class Solution {
    public boolean canAliceWin(int n) {
        int f = 10;
        int s = 0;
        while(n >= f) {
            n -= f;
            f--;
            s++;
        }
        return s % 2 != 0;
    }
}