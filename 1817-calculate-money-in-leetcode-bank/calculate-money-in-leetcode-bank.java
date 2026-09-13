class Solution {
    public int totalMoney(int n) {
        int a=1;
        int ans = 0;
        for(int i=1;i<=n;i++){
           int day = (i-1)%7;
           ans+=a+day;
           if(day==6)
           a++;
        }
        return ans;
    }
}