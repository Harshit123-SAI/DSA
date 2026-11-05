class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       int i =0,c=0;
       int sum=0;
       while(i<arr1.length) {
        sum =0;
        int j =0;
        while(j<arr2.length){
            if(Math.abs(arr1[i]-arr2[j])<=d)
                 sum =1;
                j++;
        }
        if(sum==0) 
       c++;
        i++;
       }
       return c;
    }
};