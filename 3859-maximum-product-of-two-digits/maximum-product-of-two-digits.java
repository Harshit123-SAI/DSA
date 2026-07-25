class Solution {
    public int maxProduct(int n) {
        int f = 0, s = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            if (d >= f) {
                s = f;
                f = d;
            } else if (d > s) {
                s= d;
            }
        }
        return f * s;
    }
}