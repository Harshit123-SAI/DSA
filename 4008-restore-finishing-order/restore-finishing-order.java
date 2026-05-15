class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        TreeSet<Integer> set = new TreeSet<>();
        for(int x : friends){
            set.add(x);
        }
        int i=0;
        for(int j=0;j<order.length;j++){
            if(set.contains(order[j])){
                ans[i++]=order[j];
            }
        }
        return ans;
    }
}