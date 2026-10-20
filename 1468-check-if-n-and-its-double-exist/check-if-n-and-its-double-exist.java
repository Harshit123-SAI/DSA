class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        for( i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(i!=j && arr[i]==2*arr[j]||arr[j]==2*arr[i])
                return true;
            }
        }
       return false;
    }
}