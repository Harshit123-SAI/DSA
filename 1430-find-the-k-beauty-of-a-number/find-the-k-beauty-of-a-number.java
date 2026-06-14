class Solution {
    public int divisorSubstrings(int num, int k) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        int count = 0;
        for (int i = 0; i <= sb.length() - k; i++) {
            int val = Integer.parseInt(sb.substring(i, i + k));
            if (val != 0 && num % val == 0) {
                count++;
            }
        }
        return count;
        }
    }
