class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();
         int[] A = new int[n+1];
        for(int i=n-1;i>=0;i--){
            List<Integer> cur = triangle.get(i);
            for(int j=0;j<cur.size();j++){
                A[j] = Math.min(A[j],A[j+1])+cur.get(j);
            }
        }
        return A[0];
        
//         // int min = triangle.get(0).get(0);
//         int idx = 0;
//         int sum = 0;
//         for(int i=triangle.size()-1; i>=0; i--){
//             List<Integer> cur = triangle.get(i);
//             int m = cur.size();
//             int min = Integer.MAX_VALUE;
//             for(int j=0; j<m; j++){
//                 if(i == triangle.size()-1 ){
//                     if(min > cur.get(j)){
//                     // min = Math.min(min, cur.get(j));
//                         idx = j;
//                         min = cur.get(idx);
//                         // System.out.println(idx);
//                     }
//                 }
//                 else if(idx == m){
//                     min = cur.get(idx-1);
//                     idx--;
//                     break;
//                 }
//                 else if(idx-1 >= 0){
//                     if(cur.get(idx) <= cur.get(idx-1)){
//                         min = cur.get(idx);
//                         // idx--;
//                     }
//                     else{
//                         min = cur.get(idx-1);
//                         idx--;
//                     }
//                     break;
//                 }
//                 else{
//                     min = cur.get(idx);
//                     break;
//                 }
              

//                 // break;
//             }
//             System.out.println(min+" "+idx);
//             sum += min;
//         }
        
        
//         return sum;
    }
}