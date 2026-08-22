class Solution {
    public boolean checkDivisibility(int n) {
     int m=n;
     int sum = 0;
     int prod = 1;
     while(m>0){
        int digit = m%10;
        sum+= digit;
        prod*=digit;
        m/=10;
     }
     return n%(sum+prod)==0;

    }
}