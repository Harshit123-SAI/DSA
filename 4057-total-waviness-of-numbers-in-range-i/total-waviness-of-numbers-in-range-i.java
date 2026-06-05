class Solution {
    private int waviness(int num) {
        int[] digits = new int[10];
        int len = 0;
        while (num > 0) {
            digits[len++] = num % 10;
            num /= 10;
        }
        int count = 0;
        for (int i = 1; i < len - 1; i++) {
            int prev = digits[i + 1];
            int curr = digits[i];
            int next = digits[i - 1];
            if ((curr > prev && curr > next) ||
                (curr < prev && curr < next)) {
                count++;
            }
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int num = num1; num <= num2; num++) {
            ans += waviness(num);
        }
        return ans;
    }
}