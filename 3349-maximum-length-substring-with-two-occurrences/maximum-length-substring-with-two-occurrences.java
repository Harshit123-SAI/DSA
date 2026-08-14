class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int a = 0;
        int ans = 0;
        for (int b = 0; b < s.length(); b++) {
            freq[s.charAt(b) - 'a']++;
            while (freq[s.charAt(b) - 'a'] > 2) {
                freq[s.charAt(a) - 'a']--;
                a++;
            }
            ans = Math.max(ans, b - a + 1);
        }
        return ans;
    }
}