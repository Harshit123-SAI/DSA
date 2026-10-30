class Solution {
    static List<List<Integer>> arr;
    public void helper(int i,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length){
            //arr.add(ans);
            //return;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0;j<ans.size();j++){
            list.add(ans.get(j));
        }
        arr.add(list);
        return;
    }
        helper(i+1,nums,ans);
        ans.add(nums[i]);
        helper(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }
     
    public List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper (0,nums,ans);
        return arr;
        
    }
}