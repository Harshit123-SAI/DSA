class Solution {
    public boolean isFascinating(int n) {
        int m = 2 * n;
        int x = 3 * n;
        String s = Integer.toString(n) + Integer.toString(m) + Integer.toString(x);
        if (s.length() != 9) {
            return false;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char p : s.toCharArray()) {
            if (p == '0') {
                return false;
            }
            mp.put(p, mp.getOrDefault(p, 0) + 1);
        }
        for (int count : mp.values()) {
            if (count != 1) {
                return false;
            }
        }
        return true;
    }
}