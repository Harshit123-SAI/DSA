class Solution {
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =temp;
    }
    public int findDuplicate(int[] arr) {
        
        
        while(true){
            int ele = arr[0];
            if(arr[ele]==ele) return ele;
            swap(0,ele,arr);
        }
        
    }
}