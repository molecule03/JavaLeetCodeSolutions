class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        
        int n = nums.size();
        
        int slow = 0;
        int fast = 0;
        for(int i=0; i<n; i++){
        
            
            if(slow == 0 && fast ==0){
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            else if(slow != fast){
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            else{
                fast = 0;
                while(fast != slow){
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return fast;
            }
        }
        
    return -1;
    }
};