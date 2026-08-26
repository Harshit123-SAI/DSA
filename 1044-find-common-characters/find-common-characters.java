class Solution {
    public List<String> commonChars(String[] words) {
        int[] minCounts = new int[26];
        Arrays.fill(minCounts, Integer.MAX_VALUE);
        for (String word : words) {
            int[] counts = new int[26];
            word.chars().forEach(c -> counts[c - 'a']++);
            for (int i = 0; i < 26; i++) minCounts[i] = Math.min(minCounts[i], counts[i]);
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minCounts[i]-- > 0) res.add(String.valueOf((char) ('a' + i)));
        }
        return res;
    }
}