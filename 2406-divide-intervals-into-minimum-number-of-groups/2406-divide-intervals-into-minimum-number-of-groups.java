class Solution {
    public int minGroups(int[][] intervals) {
        
        int n = intervals.length;
        // Arrays.sort(intervals, (a,b)-> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue();
        // List<int[]> res = new ArrayList<>();
         int count = 1;
        // for(int a[] : intervals){
        //     int arr[] = new int[2];
        //     arr[0] = a[0];
        //     arr[1] = a[1];
        //     res.add(arr);
        // }
        
        // Arrays.sort(arr);
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        // for(int a[] : intervals)
        // System.out.println(Arrays.toString(a));
       
        pq.offer(intervals[0][1]);
        for(int i=1; i<n; i++){
            int right = intervals[i][1];
            int left = intervals[i][0];
            // if(right >= left && intervals[i-1][0] != left) count++;
            if(pq.peek() >= left) count++;
            else pq.poll();
            
            pq.offer(right);
        }
        
        // if(count == 0) return 1;
        return count;
    }
}