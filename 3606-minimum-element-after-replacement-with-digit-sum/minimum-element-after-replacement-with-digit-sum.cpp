class Solution {
public:
 int print(int a){
            
            int sum=0;
            while(a>0){
            int m=a%10;
            sum+=m;
            a=a/10;
            }
            return sum;
        }
    int minElement(vector<int>& nums) {
        for(int i=0;i<nums.size();i++){
            nums[i]=print(nums[i]);
        }
        
       
        int m=*min_element(nums.begin(),nums.end());
        return m;
    }
};