class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            int start1 = a[i][0];
            int end1 = a[i][1];
            int start2 = b[j][0];
            int end2 = b[j][1];
            int s = Math.max(start1, start2);
            int e = Math.min(end1, end2);
            if (s <= e) {
                res.add(new int[]{s, e});
            }
            if (end1 <= end2)
                i++;
            else
                j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}