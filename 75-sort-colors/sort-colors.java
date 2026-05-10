
     class Solution {
    public void sortColors(int[] arr) {
         int n=arr.length;
        int noz=0,noo=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0) noz++;
            if (arr[i]==1) noo++;
        }
        for(int i=0;i<n;i++){
            if (i<noz) arr[i]=0;
            else if(i<noz+noo) arr[i]=1;
            else arr[i]=2;
        }
    }
}

        
    