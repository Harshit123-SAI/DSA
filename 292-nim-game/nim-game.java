class Solution {
    public boolean canWinNim(int n) {
     
        if(n%4>=1&& n%4<=3){
            return true;
        }
        return false;
    }
}