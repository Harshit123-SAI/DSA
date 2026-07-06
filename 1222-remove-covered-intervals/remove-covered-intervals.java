class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=0;
        for (int i=0;i<intervals.length;i++){
            int x=intervals[i][0];
            int y=intervals[i][1];
            for (int j=0;j<intervals.length;j++) {
                if (i!=j && intervals[j][0]<=x && y<=intervals[j][1]){
                    count++;
                    break;
                }
            }
        }
        return intervals.length-count;
    }
}