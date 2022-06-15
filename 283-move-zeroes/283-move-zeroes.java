class Solution {
    public void moveZeroes(int[] nums) {
        
        int low = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                low = i;
                break;
            }
        }
        
        int high = low+1;
        while(low>=0 && high<nums.length){
            if(nums[low]==0 && nums[high]==0){
                high++;
                continue;
            }
            swap(low, high, nums);
            low++;
            high++;
        }
            
        
    }
    
    
    private void swap(int x, int y, int[] nums){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}