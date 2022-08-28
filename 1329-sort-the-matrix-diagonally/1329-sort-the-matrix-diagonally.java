class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=m-1; i>=0; i--){
            
            int sr = 0;
            int sc = i;
            List<Integer> list = new ArrayList<>();
            while(sc < m && sr < n ){
                list.add(mat[sr][sc]);
                sc++;
                sr++;
            }
            
            sr = 0;
            sc = i;
            Collections.sort(list);
            while(sc < m && sr < n ){
                mat[sr][sc] = list.get(sr);
                sc++;
                sr++;
            }
            
        }
        
        for(int i=1; i<n; i++){
            
            int sr = i;
            int sc = 0;
            List<Integer> list = new ArrayList<>();
            while(sc < m && sr < n ){
                list.add(mat[sr][sc]);
                sc++;
                sr++;
            }
    
            sr = i;
            sc = 0;
            Collections.sort(list);
            while(sc < m && sr < n ){
                mat[sr][sc] = list.get(sc);
                sc++;
                sr++;
            }
            
        }
        
        return mat;
    }
}