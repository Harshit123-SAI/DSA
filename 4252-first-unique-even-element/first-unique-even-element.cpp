
class Solution {
public:
    int firstUniqueEven(vector<int>& nums) {
        unordered_map<int,int>mp;
        for(auto x:nums){
            if(x%2==0)
            mp[x]++;
        }
        for(auto x:nums){
            if(x%2==0 && mp[x]==1)
            return x;
        }
        return -1;
    }
};