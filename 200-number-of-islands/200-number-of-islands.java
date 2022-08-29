class Solution {
    
    boolean vis[][];
    int n;
    int m;
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        vis = new boolean[n][m];
        
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        
        
        return count;
    }
    
    
    private void dfs(int i, int j, char[][] grid){
        
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j] == '0' || vis[i][j])
            return;
        
        vis[i][j] = true;
        dfs(i-1, j, grid);
        dfs(i, j-1, grid);
        dfs(i+1, j, grid);
        dfs(i, j+1, grid);
        
        
        return;
    }
}