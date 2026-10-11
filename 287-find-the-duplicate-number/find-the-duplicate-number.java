class Solution {
    
    public int findDuplicate(int[] arr) {
        int slow =0;
        int fast = 0;
        while(true){
            slow = arr[slow];
            fast = arr[fast];
            fast = arr[fast];
            if(slow==fast){
                slow=0;
                while(slow!=fast){
                    slow= arr[slow];
                    fast = arr[fast];               
                }
                return slow;
            
        }
       
        }
      
    }
}