class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] count = new int[128];
        for (char c : t.toCharArray()) {
            count[c]++;
        }
        int l = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            if (count[ch] > 0) {
                required--;
            }
            count[ch]--;
            while (required == 0) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                char left = s.charAt(l);
                count[left]++;
                if (count[left] > 0) {
                    required++;
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}