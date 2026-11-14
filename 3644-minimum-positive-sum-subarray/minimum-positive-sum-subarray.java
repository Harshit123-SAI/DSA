class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < nums.size(); i++) {
            int sum = 0;

            for(int j = i; j < nums.size(); j++) {
                sum += nums.get(j);

                int len = j - i + 1;

                if(len >= l && len <= r && sum > 0) {
                    res = Math.min(res, sum);
                }

                if(len >= r) {
                    break;
                }
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}