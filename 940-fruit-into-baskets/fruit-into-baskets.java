class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;
        int h=0,l=0;
        int res =0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(h=0;h<n;h++){
            mp.put(fruits[h],mp.getOrDefault(fruits[h],0)+1);
            while(mp.size()>2){
               int left = fruits[l];
               mp.put(left,mp.get(left)-1);
                if(mp.get(left)==0){
                    mp.remove(left);
                }
                l++;
            }
            int len = h-l+1;
            res = Math.max(res,len);
        }
        return res;
    }
}