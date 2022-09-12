class Solution {
    public int minGroups(int[][] intervals) {
        
        int n = intervals.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue();
         int count = 1;
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
       
        pq.offer(intervals[0][1]);
        for(int i=1; i<n; i++){
            int right = intervals[i][1];
            int left = intervals[i][0];
            // if(right >= left && intervals[i-1][0] != left) count++;
            if(pq.peek() >= left) count++;
            else pq.poll();
            
            pq.offer(right);
        }
        
        return count;
    }
}