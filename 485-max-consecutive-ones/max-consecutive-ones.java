class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        java.util.ArrayList<Integer> ans = new java.util.ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                ans.add(count);
            } else if (nums[i] == 0) {
                count = 0;
            }
        }
        if (ans.isEmpty()) return 0;  
        int maxVal = java.util.Collections.max(ans);
        return maxVal;
    }
}