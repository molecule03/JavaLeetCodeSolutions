class Solution {
public void setZeroes(int[][] mat) {
int c = matrix[0].length;
int r = matrix.length;
Set<Integer> row = new HashSet<>();
Set<Integer> col = new HashSet<>();
for(int i=0; i<r; i++){
for(int j=0; j<c; j++){
if(matrix[i][j] == 0){
mat
}
}
}
System.out.println(col+" "+ row);
for(int i=0; i<r; i++){
for(int j=0; j<c; j++){
if(row.contains(i) || col.contains(j)){
matrix[i][j] = 0;
}
}
}
}
}