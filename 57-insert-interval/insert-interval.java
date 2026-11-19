class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        boolean insert = false;
        for (int[] in : intervals) {
            if (in[1] < start) {
                ans.add(in);
            }
            else if (in[0] > end) {
                if (!insert) {
                    ans.add(new int[]{start, end});
                    insert = true;
                }
                ans.add(in);
            }
            else {
                start = Math.min(start, in[0]);
                end = Math.max(end, in[1]);
            }
        }
        if (!insert) {
            ans.add(new int[]{start, end});
        }
        return ans.toArray(new int[ans.size()][]);
    }
}