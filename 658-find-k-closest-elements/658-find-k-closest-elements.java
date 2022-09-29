class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int n = arr.length;
        
        Arrays.sort(arr);
        int mat[][] = new int[n][2];
        for(int i=0; i<n; i++){
            mat[i][0] = Math.abs(arr[i]-x);
            mat[i][1] = i;
        }
        
        Arrays.sort(mat, (a,b)-> (a[0]==b[0]) ? arr[a[1]]-arr[b[1]] : a[0]-b[0]);
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<k; i++){
            list.add(arr[mat[i][1]]);
        }
        
        Collections.sort(list);
        return list;
    }
}