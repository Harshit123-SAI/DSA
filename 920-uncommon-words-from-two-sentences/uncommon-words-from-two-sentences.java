class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words = (s1 + " " + s2).split(" ");
        List<String> ans = new ArrayList<>();
        for (String w : words) {
            int count = 0;
            for (String x : words) {
                if (w.equals(x)) count++;
            }
            if (count == 1) ans.add(w);
        }
        return ans.toArray(new String[0]);
    }
}