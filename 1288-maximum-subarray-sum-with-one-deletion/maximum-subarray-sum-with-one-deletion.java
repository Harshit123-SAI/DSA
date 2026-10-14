class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;
            nodelete = Math.max(nodelete+arr[i],arr[i]);
            int v2;
            if(prevonedelete == Integer.MIN_VALUE)
             v2 = Integer.MIN_VALUE;
            else
            v2 = prevonedelete+arr[i];
            onedelete = Math.max(v2,prevnodelete);
            res = Math.max(res,Math.max(onedelete,nodelete));
        }
        return res;
    }
}