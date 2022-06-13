class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        // int freq[] = new int[n];
        
        // System.out.println(Arrays.toString(freq));
        
        int slow=0, fast=0;
        for(int i=0; i<n; i++){
              // System.out.println(slow+" "+fast)
            if(slow==0 && fast==0){
                slow = nums[slow];
                fast = nums[nums[fast]];  
            }else if(slow != fast){
                slow = nums[slow];
                fast = nums[nums[fast]]; 
            }
            else if(slow == fast){
                break;
            }
        }
        
        fast = 0;
        for(int i=0; i<n; i++){
            // System.out.println(slow+" "+fast);
            if(slow == fast){
                return slow;
            }
            slow = nums[slow];
            fast = nums[fast];
        }
        
        
        return -1;
    }
}