class Solution {
    public boolean validDigit(int n, int x) {
        boolean digit = false;
        while (n > 9) {
            if (n % 10 == x) {
                digit = true;
            }
            n /= 10;
        }
        return digit && (n != x);
    }
}