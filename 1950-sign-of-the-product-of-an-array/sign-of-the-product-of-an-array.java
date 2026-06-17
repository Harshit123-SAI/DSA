class Solution {

    public int signFunction(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public int arraySign(int[] nums) {
        int x = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }

            if (nums[i] < 0) {
                x = -x;
            }
        }

        return signFunction(x);
    }
}