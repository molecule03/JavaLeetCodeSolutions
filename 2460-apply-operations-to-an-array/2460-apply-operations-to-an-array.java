class Solution {
    public int[] applyOperations(int[] nums) {
        
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        
        // System.out.println(Arrays.toString(nums));
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(i != 0) list.add(i);
        }
        
        int l = 0;
        for(l = 0; l<list.size(); l++){
            nums[l] = list.get(l);
        }
        
        while(l <n){
            nums[l++] = 0;
        }
        
        return nums;
    }
}