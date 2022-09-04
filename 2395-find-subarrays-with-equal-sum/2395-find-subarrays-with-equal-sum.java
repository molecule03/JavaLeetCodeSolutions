class Solution {
    public boolean findSubarrays(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]+nums[1]);
        
        int left = 1;
        int right = 2;
        int n = nums.length;
        while(right < n){
            if(set.contains(nums[left]+nums[right])) return true;
            set.add(nums[left]+nums[right]);
            left++;
            right++;
        }
        
        
        return false;
    }
}