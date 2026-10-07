class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k)
            return 0;

        Map<Character, Integer> mp = new HashMap<>();

        for (char ch : s.toCharArray())
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) < k) {
                return Math.max(
                    longestSubstring(s.substring(0, i), k),
                    longestSubstring(s.substring(i + 1), k)
                );
            }
        }

        return s.length();
    }
}