class Solution {
    boolean isPrime(int x){
        if(x<2) return false;
        for(int i =2;i*i<=x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for( int a:nums){
           mp.put(a,mp.getOrDefault(a,0)+1);
        }
         for(int freq:mp.values()){
            if(isPrime(freq)) return true;
         }
         return false;
    }
}