class Solution {
    public int findGCD(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            a=Math.min(a,nums[i]);
            b=Math.max(b,nums[i]);
        }
        return gcd(a,b);
    }
    private int gcd(int x,int y){
        while(y!=0){
            int t=y;
            y=x%y;
            x=t;
        }return x;
    }
}