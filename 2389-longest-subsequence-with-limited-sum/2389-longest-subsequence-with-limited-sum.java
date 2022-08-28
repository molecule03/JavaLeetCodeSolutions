class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        int n = nums.length;
        int m = queries.length;
        int ans[] = new int[m];
        
        Arrays.sort(nums);
        
        for(int i=0; i<m; i++){
            int query = queries[i];
            int count = 0;
            int sum = 0;
            for(int j : nums){
                if(j+sum <= query){
                sum += j;
                count++;
                }
                else
                    break;
            }
            ans[i] = count;
        }
        
        
        return ans;
    }
}