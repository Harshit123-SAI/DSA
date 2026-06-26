class Solution {
    public void sortColors(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        while (mid <= hi) {
            if (arr[mid] == 2) {
                swap(arr, mid, hi);
                hi--;
            } 
            else if (arr[mid] == 0) {
                swap(arr, mid, lo);
                lo++;
                mid++;
            } 
            else {
                mid++;
            }
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
