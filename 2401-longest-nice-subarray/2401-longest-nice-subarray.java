class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        int count = 1;
        int left = 0;
        int right = 1;
        int max = 0;
        int sum = nums[left];
        // boolean flag = true;
        while(right < nums.length && left < nums.length-1){
            if((sum & nums[right]) == 0){
                // System.out.println("Here "+left+" "+right);
                // flag = false;
                max = Math.max((right-left), max);
                sum += nums[right];
                right++;
            }
            else{
                 // System.out.println("Down "+left+" "+right);
                sum -= nums[left];
                left++;
                // right++;
            }
        }
        
        // if(flag) return 1;
        return max+1;
    }
}