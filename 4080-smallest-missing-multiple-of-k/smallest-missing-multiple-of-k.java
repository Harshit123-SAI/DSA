class Solution {
    public int missingMultiple(int[] nums, int k) {

        boolean[] present = new boolean[101];

        for (int num : nums) {
            present[num] = true;
        }

        for (int i = 1; ; i++) {
            int multiple = i * k;

            if (multiple >= present.length || !present[multiple]) {
                return multiple;
            }
        }
    }
}