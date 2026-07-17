class Solution {
    public int findLucky(int[] arr) {
       int[] freq = new int[1001];
       for (int x :arr){
        freq[x]++;
       }
       for(int i=1000;i>0;i--){
        if (freq[i]==i){
            return i;
        }
       }
       return -1;
    }
}