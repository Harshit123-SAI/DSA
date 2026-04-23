import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int l = 0;
        int maxLength = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            if (hash.containsKey(ch)) {
                l = Math.max(l, hash.get(ch) + 1);
            }

            hash.put(ch, r);
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}