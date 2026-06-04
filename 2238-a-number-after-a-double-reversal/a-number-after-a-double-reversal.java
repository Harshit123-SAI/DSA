class Solution {
    public int reverse(int n){
        int ans=0;
        while(n>0){
            int digit=n%10;
            ans=(ans*10)+digit;
            n=n/10;
        }
        return ans;
    }
    public boolean isSameAfterReversals(int num) {
        int ans = reverse(reverse(num));
        if(ans==num) return true;
        return false;
    }
}