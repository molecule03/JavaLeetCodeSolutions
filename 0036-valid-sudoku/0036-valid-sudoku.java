class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        
        Set<String> row = new HashSet<>();
        row.add(".");
        Set<String> col = new HashSet<>();
        col.add(".");
        String dot = ".";
        Set<String> box = new HashSet<>();
        box.add(".");
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.') continue;
                if(row.contains(i+"+"+board[i][j]) || col.contains(j+"+"+board[i][j]) ||   box.contains(i/3+"+"+board[i][j]+"+"+j/3))
                    return false;
                
                row.add(i+"+"+board[i][j]);
                col.add(j+"+"+board[i][j]);
                box.add(i/3+"+"+board[i][j]+"+"+j/3);
                // System.out.println(box);
            }
        }
        
        
        return true;
    }
}