class Solution {
    public String minWindow(String s, String t) {
        int[] a = new int[128];
        for (char c : t.toCharArray()) a[c]++;
        int l = 0, need = t.length(), start = 0, min = Integer.MAX_VALUE;
        for (int r = 0; r < s.length(); r++) {
            if (a[s.charAt(r)]-- > 0) need--;
            while (need == 0) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }
                if (++a[s.charAt(l++)] > 0) need++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}