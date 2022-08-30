class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        int n = mat.length;
        
        int res1[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res1[i][j] = mat[n-1-j][i];
            }
        }
        
        int res2[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res2[i][j] = res1[n-1-j][i];
            }
        }
        
        int res3[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res3[i][j] = res2[n-1-j][i];
            }
        }
        
        
        int res4[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res4[i][j] = res3[n-1-j][i];
            }
        }
        
        return (Arrays.deepEquals(res1, target) || Arrays.deepEquals(res2, target) || 
                Arrays.deepEquals(res3, target) || Arrays.deepEquals(res4, target)  );
    }
}