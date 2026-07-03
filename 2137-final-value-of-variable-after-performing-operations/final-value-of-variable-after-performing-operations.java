class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int inc=0;
        int dec=0;
        for(String s : operations){
            if(s.equals("X++") || s.equals("++X")) inc++;
            else dec++;
        }
        return inc-dec;
    }
}