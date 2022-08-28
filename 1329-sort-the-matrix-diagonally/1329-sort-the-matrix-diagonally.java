class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        List<List<Integer>> sorted = new ArrayList<>();
        
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
            Collections.sort(list);
            // System.out.println(list);
            sr = 0;
            sc = i;
            while(sc < m && sr < n ){
                mat[sr][sc] = list.get(sr);
                sc++;
                sr++;
            }
            
            
            
            
            
            sorted.add(list);
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
            Collections.sort(list);
            // System.out.println(list);
            
            sr = i;
            sc = 0;
            while(sc < m && sr < n ){
                mat[sr][sc] = list.get(sc);
                sc++;
                sr++;
            }
            sorted.add(list);
        }
        
        return mat;
    }
}