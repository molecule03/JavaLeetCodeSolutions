class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        
        int n = costs.length;
        
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        
        if(candidates*2 <= n){
            for(int i=0; i<candidates; i++){
                left.add(costs[i]);
            }
            
            for(int i=n-candidates; i<n; i++){
                right.add(costs[i]);
            }
        }
        else{
            for(int i=0; i<candidates; i++) left.add(costs[i]);
            for(int i=candidates; i<n; i++) right.add(costs[i]);
        }
        
        int l = candidates;
        int r = n-candidates-1;
        System.out.println(n+" "+l+" "+r);
        long ans = 0;
        long prev = 0;
        while(k--> 0){
            if(left.peek() != null && right.peek() != null){
            if(left.peek()>right.peek()){
                ans += right.remove();
                if(l<=r){
                    right.add(costs[r--]);
                }
            }
            else{
                ans += left.remove();
                if(l<=r){
                    left.add(costs[l++]);
                }
            }
            }
            else if(left.peek() != null){
                 ans += left.remove();
            }
            else if(right.peek() != null){
                 ans += right.remove();
            }
            
            System.out.println(ans-prev);
            prev = ans;
        }
        
        return ans;
    }
}