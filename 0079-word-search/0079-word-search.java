class Solution {
    
    int n;
    int m;
    boolean seen[][];
    
    public boolean exist(char[][] board, String word) {
        
         n = board.length;
         m = board[0].length;
        
        seen = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == word.charAt(0) && sameWord(i, j, 0, word, board))
                    return true;
            }
        }
        
        return false;
    }
    
    private boolean sameWord(int i, int j, int idx, String word, char[][] board){
        if(idx >= word.length()) return true;
        
        // System.out.println(idx);
        if(i < 0 || i >= n || j < 0 || j >= m || seen[i][j] || board[i][j] != word.charAt(idx)) return false;
        
        seen[i][j] = true;
        
        boolean ans = sameWord(i+1, j, idx+1, word, board) || sameWord(i, j+1, idx+1, word, board) || sameWord(i-1, j, idx+1, word, board) || sameWord(i, j-1, idx+1, word, board);
        
        seen[i][j] = false;
        
        return ans;
    }
}