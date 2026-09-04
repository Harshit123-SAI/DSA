class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i =0;
        int j=1;
        int res=1;
        while(j<nums.size()){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }
            nums[i+1]=nums[j];
            i++;
            j++;
            res++;
        }
        return res;
    }
};