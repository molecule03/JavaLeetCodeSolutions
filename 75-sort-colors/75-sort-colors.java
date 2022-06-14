class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        while(mid <= high){
            switch(nums[mid])
            {
                case 0 :
                    swap(mid, low, nums);
                    mid++;
                    low++;
                    break;
                    
                case 1 :
                    mid++;
                    break;
                    
                case 2:
                    swap(mid, high, nums);
                    // mid++;
                    high--;
                    break;
            }
        }   
            
    }
    
    private void swap(int x, int y, int[] nums){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}