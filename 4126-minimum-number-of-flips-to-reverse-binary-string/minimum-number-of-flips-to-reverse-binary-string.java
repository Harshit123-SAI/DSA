class Solution {
    public int minimumFlips(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        String s = sb.toString();
        String rev = sb.reverse().toString();
        int flips = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != rev.charAt(i)) {
                flips++;
            }
        }
        return flips;
    }
}