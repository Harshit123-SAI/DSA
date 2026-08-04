class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>  ans = new ArrayList<>();
        HashSet<Integer> st =new HashSet<>();
        int max = Integer.MIN_VALUE;        
        int min = Integer.MAX_VALUE;
        for(int x: nums){
        max = Math.max(x,max);
        min = Math.min(x,min);
        st.add(x);
        }
        for(int i=min;i<=max;i++){
            if(!st.contains(i)) ans.add(i);
        }
        
        return ans;

    }
}