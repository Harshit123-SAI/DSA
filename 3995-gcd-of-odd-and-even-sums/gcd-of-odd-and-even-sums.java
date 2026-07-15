class Solution {
    public int gcdOfOddEvenSums(int n) {
      int sumEven = 0;
      int sumOdd = 0;
      for (int i=1;i<=n*2;i+=2) sumOdd+=i;
      for (int i=0;i<=n*2;i+=2) sumEven+=i;
      int r = gcd(sumOdd,sumEven);
      return r;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp= b;
            b=a%b;
            a = temp;
        }
        return a;
    }
}