class Solution {
    
    int n;
    int m;
    int heights[][];
    boolean seen[][];
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        this.heights = heights;
        n = heights.length;
        m = heights[0].length;
        seen = new boolean[n][m];
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                List<Integer> list = new ArrayList<>();
                if(pacific(i, j, heights[i][j]) && atlantic(i, j, heights[i][j])){
                    list.add(i);
                    list.add(j);
                }
                if(!list.isEmpty()) res.add(list);
            }
        }
        
        return res;
    }
    
    
    private boolean pacific(int i, int j, int last){
        
        if(i < 0 || j < 0 ) return true;
        
        if(i >=n || j>=m || seen[i][j]) return false;
        
        seen[i][j] = true;
        boolean flag = false;
        int cur = heights[i][j];
        if(cur <= last){
            flag = pacific(i+1, j,  cur) ||
                    pacific(i, j+1, cur) ||
                    pacific(i-1, j, cur) ||
                    pacific(i, j-1,  cur);
        }
        seen[i][j] = false;
        
        return flag;
    }
    
    private boolean atlantic(int i, int j,  int last){
        
        if(i >= n || j >= m ) return true;
        if(i < 0 || j <0 || seen[i][j]) return false;
        
        seen[i][j] = true;
        boolean flag = false;
        int cur = heights[i][j];
        if(cur <= last){
            flag = atlantic(i+1, j,  cur) ||
                     atlantic(i, j+1,  cur) ||
                     atlantic(i-1, j,  cur) ||
                     atlantic(i, j-1, cur);
        }
        seen[i][j] = false;
        
        return flag;
    }
    
}