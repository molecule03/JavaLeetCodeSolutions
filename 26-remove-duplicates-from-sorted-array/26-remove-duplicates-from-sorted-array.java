class Solution {
    public int removeDuplicates(int[] nums) {
        
        int low = 0;
        int high = 1;
    
        while(high < nums.length){
            if(nums[low] == nums[high]){
                high++;
            }
            else{
                low++;
                swap(low, high, nums);
                high++;
            }
        }
        
        return low+1;
    }
    
    private void swap(int x, int y, int[]nums){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}