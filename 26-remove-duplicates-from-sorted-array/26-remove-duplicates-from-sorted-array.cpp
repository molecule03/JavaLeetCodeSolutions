class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int low = 0;
        int high = 1;
    
        while(high < nums.size()){
            if(nums[low] == nums[high]){
                high++;
            }
            else{
                low++;
                swap(nums[low], nums[high]);
                high++;
            }
        }
        
        return low+1;
    }
};