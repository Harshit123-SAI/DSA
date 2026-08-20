class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
       int[] arr1 = new int[n];
       int[] arr2 = new int[n];
       int[] res =new int[n];
       int a =0;
       int b=0;
       arr1[a++] = nums[0];
       arr2[b++] = nums[1];
       for(int i=2;i<n;i++){
        if(arr1[a-1]>arr2[b-1]){
            arr1[a++] = nums[i];
       } else{
            arr2[b++] = nums[i];
            }
       }
            int k=0;
            for(int i=0;i<a;i++){
                res[k++] = arr1[i];
            }
            for(int i=0;i<b;i++){
                res[k++] = arr2[i];
            }
        return res;
    }

}