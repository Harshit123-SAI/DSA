class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int mx = nums[0];
        prefixGcd[0]=gcd(nums[0],mx);
        for (int i=1;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(nums[i],mx);
        }
        long sum=0;
        Arrays.sort(prefixGcd);
        int i=0;
        int j = prefixGcd.length-1;
        while(i<j){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;

        }
        return sum;
    }
        private int gcd(int a, int b){
            while(b!=0){
                int temp=b;
                b = a%b;
                a = temp;
            }
            return a;
        }
    }
