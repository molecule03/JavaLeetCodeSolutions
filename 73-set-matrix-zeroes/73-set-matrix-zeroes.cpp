class Solution {
public:
    void setZeroes(vector<vector<int>>& mat) {
        int r = mat.size();
        int c = mat[0].size();
        
         int flag = 1;
        for(int i=0; i<r; i++){
            if(mat[i][0] == 0)
                flag = 0;
            for(int j=1; j<c; j++){
                if(mat[i][j] == 0){
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
         
        
        for(int i=r-1; i>0; i--){
            for(int j=c-1; j>0; j--){
                if(mat[0][j]==0 || mat[i][0]==0){
                    mat[i][j] = 0;
                }
            }
        }
        
 
        if(mat[0][0] == 0){
            for(int j=0; j<c; j++){
                mat[0][j] = 0;
            }
        }
        
        if(flag == 0){
            for(int i=0; i<r; i++){
                mat[i][0] = 0;
            }
        }
    }
};