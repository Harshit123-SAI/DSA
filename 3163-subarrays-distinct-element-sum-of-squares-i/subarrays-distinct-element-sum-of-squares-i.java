class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum =0;
     int c=0;
     for(int i=0;i<n;i++){
        HashSet<Integer> st = new HashSet<>();
        for(int j=i;j<n;j++){
            st.add(nums.get(j));
            c= st.size();
            sum+=c*c;
        }
     }
     return sum;
    }
}