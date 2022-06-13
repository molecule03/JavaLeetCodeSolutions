class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        int freq[] = new int[n];
        
        System.out.println(Arrays.toString(freq));
        
        for(int i=0; i<nums.length; i++){
            if(freq[nums[i]] == 0){
                freq[nums[i]] = 1;
            }else{
                return nums[i];
            }
        }
        
        return -1;
    }
}