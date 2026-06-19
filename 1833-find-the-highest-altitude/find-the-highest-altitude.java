class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int alti = 0;
        int count = 0;
        for (int i = 0;i<n;i++){
            count+=gain[i];
            if (alti<count)
              alti = count;
          
        }
        return alti;
    }
}