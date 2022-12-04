class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int n = nums.length;
        if(n == 1) return 0;
        long preSum[] = new long[n];
        
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            preSum[i] = sum/(i+1);
        }
        
        sum = 0;
        long sufSum[] = new long[n];
        sufSum[n-1] = 0;
        for(int i=1; i<n; i++){
            sum += nums[n-i];
            sufSum[n-i-1] = sum/i; 
        }
        
        // System.out.println(Arrays.toString(preSum)+" "+Arrays.toString(sufSum));
        long ans = Integer.MAX_VALUE;
        long min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i=0; i<n; i++){
            ans = Math.min(ans, (Math.abs(preSum[i]-sufSum[i])) );
            // System.out.println(ans);
            if(ans < min){
                min = ans;
                idx = i;
            }
        }
        
        return idx;
    }
}