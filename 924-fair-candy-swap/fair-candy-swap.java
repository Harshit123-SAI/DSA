class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        int sum2=0;
        for (int a: aliceSizes){
            sum1 += a;
        }
        for(int b:bobSizes){
            sum2 += b;
        }
        int diff = (sum1-sum2)/2;
        HashSet<Integer> set = new HashSet<>();
        for (int b : bobSizes) {
            set.add(b);
        }
        for (int a : aliceSizes) {
            int b = a - diff;
            if (set.contains(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{};
    }
}